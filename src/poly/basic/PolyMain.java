package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();


        // 부모 변수가 자식 인스턴스를 참조 (다형적 참조)
        // 반대로 자식 타입은 부모 타입을 담을 수 없다 !
        System.out.println("Parent => Child");
        Parent poly = new Child(); // 부모 타입 변수에 자식 참조
        poly.parentMethod();
//        poly.childMethod(); > poly 는 parentMethod 만 알고있다 !
        // -> 자식의 기능은 호출할 수 없다. 컴파일 오류 발생.
        // childMethod() 를 호출하고 싶다면 ?! => 캐스팅 이용.



    }
}
