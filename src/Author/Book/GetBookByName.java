package Author.Book;

import Author.Book.Book;
import Author.Book.BookService;
import Author.MenuAction;

import java.util.List;
import java.util.Scanner;

public class GetBookByName implements MenuAction {
    private BookService bookService;

    public GetBookByName(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book name:");
        String name = scanner.nextLine();

        List<Book> books = bookService.getBooks(name);

        if (books.isEmpty()) {
            System.out.println("Books not found.");
        } else {
            System.out.println("Books with name '" + name + "':");
            for (Book book : books) {
                System.out.println(book.getId() + ") " + book.getTitle() + " by " + book.getAuthor().getName());
            }
        }
    }
}