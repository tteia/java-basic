package AuthorException;


import java.util.*;

public class AuthorRepository {
    List<Author> authorList;

    public AuthorRepository(){
        authorList = new ArrayList<>();
    }

    void register(Author author){
        this.authorList.add(author);
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

}