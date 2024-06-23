package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit m : members) {
            System.out.println("이름 : "+ m.name + ", 나이 : " + m.age + ", 점수 : " + m.grade);
        }

        // 회원 객체를 생성하고 나면, name/age/grade 와 같은 변수에 초기값 설정 필요.
        // 생성하자마자 초기값을 설정하는데, 반복이 발생한다.
    }
}
