package Author.Book;

import Author.Book.Book;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;


public class BookRepository {
     private Map<Integer, Book> books = new HashMap<>();
     private AtomicLong idGenerator = new AtomicLong();

     public void saveBook(Book book) {
          if (book.getId() == null) {
               book.setId((int) idGenerator.incrementAndGet());
          }
          books.put(book.getId(), book);
     }

     public List<Book> getBooksByName(String name) {
          return books.values().stream()
                  .filter(b -> b.getTitle().equals(name))
                  .collect(Collectors.toList());
     }

     public List<Book> findBooksByTitleStartingWith(String letter) {
          return books.values().stream()
                  .filter(b -> b.getTitle().startsWith(letter))
                  .collect(Collectors.toList());
     }
}


