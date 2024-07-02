package AuthorException;

public class Author {
    private int id;
    private static int static_id;
    private String name;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Author(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
        static_id++; // id 를 auto_increment 시킴 !
        this.id = static_id;
    }
}
