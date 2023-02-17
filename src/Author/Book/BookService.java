package Author.Book;

import Author.Book.Book;
import Author.Book.BookRepository;
import Author.EntityNotFoundException;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public BookService() {
        this.bookRepository = new BookRepository();
    }
    public void saveBook(Book book) {
        bookRepository.saveBook(book);
    }

    /*public List<Book> getBooks(String name) {
        return bookRepository.getBooksByName(name);
    }*/
    public List<Book> getBooks(String name) throws EntityNotFoundException {
        List<Book> books = bookRepository.getBooksByName(name);
        if (books.isEmpty()) {
            throw new EntityNotFoundException("No books were found with name: " + name);
        }
        return books;
    }

    /*public List<Book> getBooksStartingWithLetter(String letter) {
        return bookRepository.findBooksByTitleStartingWith(letter);
    }*/
    public List<Book> getBooksStartingWithLetter(String letter) throws EntityNotFoundException {
        List<Book> books = bookRepository.findBooksByTitleStartingWith(letter);
        if (books.isEmpty()) {
            throw new EntityNotFoundException("No books were found starting with letter: " + letter);
        }
        return books;
    }
}







