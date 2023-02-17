package Author;

import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    @Test
    public void testGettersAndSetters() {
        Integer id = 1;
        String name = "John";
        String lastname = "Doe";
        List<Book> books = new ArrayList<>();
        Author author = new Author();

        author.setId(id);
        author.setName(name);
        author.setLastname(lastname);
        author.setBooks(books);

        assertEquals(id, author.getId());
        assertEquals(name, author.getName());
        assertEquals(lastname, author.getLastname());
        assertEquals(books, author.getBooks());
    }

    @Test
    public void testEqualsMethod() {
        Integer id = 1;
        String name = "John";
        String lastname = "Doe";
        List<Book> books = new ArrayList<>();
        Author author1 = new Author();
        author1.setId(id);
        author1.setName(name);
        author1.setLastname(lastname);
        author1.setBooks(books);

        Author author2 = new Author();
        author2.setId(id);
        author2.setName(name);
        author2.setLastname(lastname);
        author2.setBooks(books);

        assertTrue(author1.equals(author2));
    }

    @Test
    public void testHashCodeMethod() {
        Integer id = 1;
        String name = "John";
        String lastname = "Doe";
        List<Book> books = new ArrayList<>();
        Author author1 = new Author();
        author1.setId(id);
        author1.setName(name);
        author1.setLastname(lastname);
        author1.setBooks(books);

        Author author2 = new Author();
        author2.setId(id);
        author2.setName(name);
        author2.setLastname(lastname);
        author2.setBooks(books);

        assertEquals(author1.hashCode(), author2.hashCode());
    }

}