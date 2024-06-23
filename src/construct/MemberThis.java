package construct;

public class MemberThis  {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; // 앞에 this 가 생략이 되어있다 ! this 를 적어줘도 결과는 같다.
        // 이름이 같을 경우에는 꼭 ! 써줘야하지만 ex)this.name = name; 같은 경우
        // 그 외에는 생략 가능.
    }
}
