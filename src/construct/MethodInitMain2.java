package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);


        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit m : members) {
            System.out.println("이름 : "+ m.name + ", 나이 : " + m.age + ", 점수 : " + m.grade);
        }

        // 회원 객체를 생성하고 나면, name/age/grade 와 같은 변수에 초기값 설정 필요.
        // 생성하자마자 초기값을 설정하는데, 반복이 발생한다.

        // initMember 메서드를 통해 반복을 제거함. >> 여기에서도 결국 MemberInit 의 값을 수정하네?!
        // MemberInit 이 자기 자신의 데이터를 변경하도록 하는 것이 좋다.
        // MemberInit 에 추가.


    }

    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
