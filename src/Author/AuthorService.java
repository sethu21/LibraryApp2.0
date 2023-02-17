package Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public AuthorDto createAuthor(AuthorDto authorDto) {
        Author author = AuthorDtoConverter.convertToEntity(authorDto);
        author = authorRepository.saveAuthor(author);
        return AuthorDtoConverter.convertToDto(author);
    }

    public List<AuthorDto> getAllAuthors(String name) {
        List<Author> authors = authorRepository.findAll();
        if (authors.isEmpty()) {
            throw new EntityNotFoundException("No authors found");
        }
        List<AuthorDto> authorDtos = new ArrayList<>();
        for (Author author : authors) {
            authorDtos.add(AuthorDtoConverter.convertToDto(author));
        }
        return authorDtos;
    }
    public AuthorDto getAuthorById(Long id) {
        Author author = authorRepository.findById(id);
        if (author == null) {
            throw new EntityNotFoundException("Author with id " + id + " not found");
        }
        return AuthorDtoConverter.convertToDto(author);
    }
}
