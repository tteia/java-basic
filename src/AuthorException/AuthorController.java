package AuthorException;

//2.Author 컨트롤러
// 2-1.회원가입 : name, email, password 입력 -> service 의 register 메서드 호출
// -> service 에서 Author 객체 생성 -> repository 에서 register 완료
// 2-1.회원가입 예외처리 => service 에서는 throw new 발생, controller try catch 구조. (동일한 email 있는경우, 비밀번호가 5자리 이하인경우)
// 2-2.로그인 : email, password 입력 -> service 의 login 메서드 호출 -> service 에서 해당 user 가 있는지 검증 및 비밀번호 일치여부 검증

//4.AuthorRepository :  list 에 add 등 메모리 DB에 저장하는 로직
import java.util.*;

public class AuthorController {
    static AuthorRepository authorRepository = new AuthorRepository();
    public static void main(String[] args) throws Exception { // Exception 으로 에러 메세지 던져주기 !
        Scanner sc = new Scanner(System.in);

        AuthorController authorController = new AuthorController();
        AuthorService authorService = new AuthorService(authorRepository);

        while(true){
            System.out.println("이용하실 서비스를 선택하세요.");
            System.out.println("======================");
            System.out.println("1. 회원 가입");
            System.out.println("2. 로그인");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                System.out.println("1번 회원 가입 서비스입니다.");
                System.out.println("======================");
                System.out.println("이름을 입력해주세요.");
                String myName = sc.nextLine();
                System.out.println("사용하실 이메일을 입력해주세요.");
                String myEmail = sc.nextLine();
                System.out.println("사용하실 비밀번호를 입력해주세요.");
                String password = sc.nextLine();
                authorService.Register(myName, myEmail, password);
                System.out.println("회원 가입 성공 !");
            }

            else if(choice == 2){
                System.out.println("2번 로그인 서비스입니다.");
                System.out.println("======================");
                System.out.println("이메일을 입력해주세요.");
                String myEmail = sc.nextLine();
                boolean checkEmail = authorController.findEmail(myEmail);
                if(!checkEmail){
                    System.out.println("가입되지 않은 이메일입니다.");
                    continue;
                }
                System.out.println("비밀번호를 입력해주세요.");
                String myPassword = sc.nextLine();
                boolean checkPassword = authorController.findPassword(myPassword);
                if(!checkPassword){
                    System.out.println("비밀번호가 틀렸습니다.");
                    continue;
                }
                System.out.println("로그인 성공 !");
                break;
            }
            else System.out.println("잘못 선택하셨습니다.");
        }
    }

    public boolean findEmail(String email) {
        boolean check = false;

        List<Author> authors = authorRepository.getAuthorList();
        for (Author author : authors) {
            if (email.equals(author.getEmail())) {
                check = true;
            }
        }
        return check;
    }

    public boolean findPassword(String password){
        boolean check = false;
        List<Author> authors = authorRepository.getAuthorList();
        for (Author author : authors) {
            if (password.equals(author.getPassword())) {
                check = true;
            }
        }
        return check;
    }

}

