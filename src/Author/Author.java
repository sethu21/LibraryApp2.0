package Author;

import java.awt.print.Book;
import java.util.*;

public class Author {
        private Integer id;
        private String name;
        private String lastname;
        private List<Book> books = new ArrayList<>();

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public List<Book> getBooks() {
            return books;
        }

        public void setBooks(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Author author = (Author) o;
            return Objects.equals(id, author.id) && Objects.equals(name, author.name)
                    && Objects.equals(lastname, author.lastname) && Objects.equals(books, author.books);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, lastname, books);
        }

        @Override
        public String toString() {
            return "Author{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", books=" + books +
                    '}';
        }



}
