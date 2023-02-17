package Author;

public class AuthorDto {
    private String name;

    private String lastname;


    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AuthorDto(String name, String lastname, int id) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
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

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "AuthorDto{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                '}';
    }
}
