package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
        // 생성자 사용 전 > member2.initMember("user2", 16, 80); 를 깜빡하고 작성 안 했다! > 그냥 null 로 잘 작동함.
        // 생성자 사용 후 > 내가 new MemberConstruct() 했다면 > 컴파일 오류로 내가 어떤 값을 놓치고 입력하지 않았는지 바로 알 수 있다 !
        // 강제로 작성하게 한다 >> "제약" : 직접 정의한 생성자를 반드시 호출해야 함.

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct m : members) {
            System.out.println("이름 : "+ m.name + ", 나이 : " + m.age + ", 점수 : " + m.grade);
        }
    }
}
