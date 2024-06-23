package construct;

public class MemberThis  {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; // 앞에 this 가 생략이 되어있다 ! this 를 적어줘도 결과는 같다.
    }
}
