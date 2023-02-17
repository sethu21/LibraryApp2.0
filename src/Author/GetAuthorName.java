package Author;

import java.util.List;
import java.util.Scanner;


public class GetAuthorName implements MenuAction {
    private AuthorService authorService;

    public GetAuthorName(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter author name:");
        String name = scanner.nextLine();

        List<AuthorDto> authors = authorService.getAllAuthors(name);

        if (authors.isEmpty()) {
            System.out.println("Authors not found.");
        } else {
            System.out.println("Authors with name '" + name + "':");
            for (AuthorDto author : authors) {
                System.out.println(author.toString());
            }
        }
    }
    }

