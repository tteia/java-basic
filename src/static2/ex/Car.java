package static2.ex;

// Car 클래스 작성하기
//차량 구입, 이름: K3
//차량 구입, 이름: G80
//차량 구입, 이름: Model Y
//구매한 차량 수:3

public class Car {
    String name;
    static int totalCars;

    // 위 변수들을 private 로 바꾼다면 . . . .?
    // 다른 클래스에서 car1.name = "BMW"; 처럼 car1 의 name 값에 접근할 수 없다.
    // 같은 패키지 내여도 불가 !

    public Car(String name){
        this.name = name;
        totalCars++;
        System.out.println("차량 구입, 이름 : " + name);
    }


    public static void showTotalCars(){
        System.out.println("구매한 차량 수 : " + totalCars);
    }
}
