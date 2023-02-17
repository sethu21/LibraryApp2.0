package Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorDtoConverter {
    public static AuthorDto convertToDto(Author author) {
        AuthorDto authorDto = new AuthorDto(author.getName(), author.getLastname(), author.getId());
        authorDto.setName(author.getName());
        authorDto.setLastname(author.getLastname());
        authorDto.setId(author.getId());
        return authorDto;
    }

    public static  Author convertToEntity(AuthorDto authorDto) {
        Author author = new Author();
        // author.builder()
        author.setName(authorDto.getLastname());
        author.setLastname(authorDto.getLastname());
        return author;
        // .build();
    }

    public static List<AuthorDto> convertToDto(List<Author> authors) {
        List<AuthorDto> authorDtos = new ArrayList<>();
        for (Author author : authors) {
            authorDtos.add(convertToDto(author));
        }
        return authorDtos;
    }

    public static List<Author> convertToEntity(List<AuthorDto> authorDtos) {
        List<Author> authors = new ArrayList<>();
        for (AuthorDto authorDto : authorDtos) {
            authors.add(convertToEntity(authorDto));
        }
        return authors;
    }


}
