package Author;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorDtoTest {
    @Test
    public void testAuthorDto() {
        String name = "John";
        String lastname = "Doe";
        int id = 1;
        AuthorDto authorDto = new AuthorDto(name, lastname, id);

        assertEquals(name, authorDto.getName());
        assertEquals(lastname, authorDto.getLastname());
        assertEquals(id, authorDto.getId());
    }

    @Test
    public void testAuthorDtoSetters() {
        String name = "Jane";
        String lastname = "Doe";
        int id = 2;
        AuthorDto authorDto = new AuthorDto("Jane","Doe",2);
        authorDto.setName(name);
        authorDto.setLastname(lastname);
        authorDto.setId(id);

        assertEquals(name, authorDto.getName());
        assertEquals(lastname, authorDto.getLastname());
        assertEquals(id, authorDto.getId());
    }

}