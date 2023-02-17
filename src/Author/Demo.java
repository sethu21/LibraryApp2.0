package Author;

import Author.Book.BookService;
import Author.Book.GetBookByLetter;
import Author.Book.GetBookByName;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AuthorService authorService = new AuthorService(new AuthorRepository());
        BookService bookService = new BookService();

        int choice = 0;
        do {
            System.out.println("Welcome to Library Management System");
            System.out.println("1. Register an Author");
            System.out.println("2. Get Author by ID");
            System.out.println("3. Get Author Name by ID");
            System.out.println("4. Get Book by Name");
            System.out.println("5. Get Book by First Letter");
            System.out.println("6 Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    CreateAuthorMenuAction createAuthorMenuAction = new CreateAuthorMenuAction(authorService);
                    createAuthorMenuAction.execute();
                    break;
                case 2:

                    GetAuthorNameByIdMenuAction getAuthorNameByIdMenuAction = new GetAuthorNameByIdMenuAction(authorService);
                     getAuthorNameByIdMenuAction.execute();
                    break;
                case 3:

                    GetAuthorName getAuthorName = new GetAuthorName(authorService);
                     getAuthorName.execute();
                    break;

                case 4:
                    System.out.println("Enter Book Name: ");
                    String bookName = sc.nextLine();
                    GetBookByName getBookByName = new GetBookByName(bookService);
                    getBookByName.execute();
                    break;
                case 5:
                    System.out.println("Enter Book First Letter: ");
                    char bookFirstLetter = sc.nextLine().charAt(0);
                    GetBookByLetter getBookByLetter = new GetBookByLetter(bookService);
                     getBookByLetter.execute();
                    break;
                case 6:
                    System.out.println("Exiting Library Management System...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while(choice != 7);
        sc.close();
    }

}


