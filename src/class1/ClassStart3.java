package class1;

// 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요 > 설계도가 클래스.
// 설계도를 기반으로 메모리를 확보해서 사용하는 것 > 실제 메모리에 만들어진 실체가 객체, 인스턴스

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // 1번 학생을 담을 변수 선언.
        student1 = new Student(); // "학생"을 실제 메모리에 만든다.

        // Student student1 = new Student(); 로도 가능.
        Student student2 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

    }
}
