package Author;

import java.util.*;


public class AuthorRepository {
    private static Integer authorIdSequence = 0;
    private final Map<Integer, Author> repository = new HashMap<>();

    public Author saveAuthor(Author author) {
        author.setId(authorIdSequence);
        authorIdSequence++;
        repository.put(author.getId(), author);

        return author;
    }
   /* public Optional<Author> findAuthorById(Integer id) {
        return Optional.ofNullable(idGenerator.get(id));
    }*/

    public Author findById(Long id) {
        return repository.get(id.intValue());
    }

    public List<Author> findAll() {
        return new ArrayList<>(repository.values());
    }
}
