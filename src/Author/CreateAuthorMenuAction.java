package Author;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CreateAuthorMenuAction implements MenuAction {

    private AuthorService authorService;

    public CreateAuthorMenuAction(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Author's first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter Author's last name: ");
        String lastName = scanner.nextLine();
        AuthorDto authorDto = new AuthorDto(firstName,lastName,0);
        authorService.createAuthor(authorDto);
        System.out.println("Author has been registered successfully.");
        System.out.println(authorDto);
    }
        }





