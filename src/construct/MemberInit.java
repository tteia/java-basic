package construct;

public class MemberInit {
    String name;
    int age;
    int grade;


    // 추가
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    // MemberInit 으로 가져오면서 this 로 수정됐다 !
}
