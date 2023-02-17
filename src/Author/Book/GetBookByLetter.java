package Author.Book;

import Author.Book.Book;
import Author.Book.BookService;
import Author.MenuAction;

import java.util.List;
import java.util.Scanner;

public class GetBookByLetter implements MenuAction {
    private BookService bookService;

    public GetBookByLetter(BookService bookService) {
        this.bookService = bookService;
    }


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting letter: ");
        String letter = scanner.nextLine();

        List<Book> books = bookService.getBooksStartingWithLetter(letter);
        books.forEach(book -> System.out.println("Book id: " + book.getId() + " name: " + book.getTitle() + " by author: " + book.getAuthor().getName()));
    }


}
