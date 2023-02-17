package Author;

import java.util.Scanner;

public class GetAuthorNameByIdMenuAction implements MenuAction {
    private AuthorService authorService;

    public GetAuthorNameByIdMenuAction(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter author ID:");
        Long id = Long.parseLong(scanner.nextLine());

        AuthorDto author = authorService.getAuthorById(id);

        if (author != null) {
            System.out.println("Author name: " + author.getName());
        } else {
            System.out.println("Author not found.");
        }
    }
}
