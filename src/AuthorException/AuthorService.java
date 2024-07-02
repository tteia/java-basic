package AuthorException;

// 2-1.회원가입 예외처리 => service 에서는 throw new 발생, controller try catch 구조.
// (동일한 email 있는경우, 비밀번호가 5자리 이하인경우)
// 2-2.로그인 : email, password 입력 -> service 의 login 메서드 호출
// -> service 에서 해당 user 가 있는지 검증 및 비밀번호 일치여부 검증

public class AuthorService {
    AuthorRepository authorRepository;

    AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public void Register(String name, String email, String password){
        Author author = new Author(name, email, password);
        authorRepository.register(author);
    }

}
