package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
//        poly.childMethod(); > 단, 자식의 기능은 호출할 수 없다. 컴파일 오류 발생.

        // 다운캐스팅 (부모타입 --> 자식 타입)
//        Child child = poly; // poly 는 Parent 타입이라 불가 ! > 컴파일 오류
        Child child = (Child) poly; // 다운캐스팅 이용.
        child.childMethod();
    }
}
