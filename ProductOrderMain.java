package 클래스와_데이터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        // 상품 주문 정보를 productOrder 타입의 변수로 받아서 저장
        // 상품 주문 정보와 최종 금액 출력
        List<ProductOrder> orderList = new ArrayList<>();
        ProductOrder[] orders = new ProductOrder[3]; //와 차이는?

        ProductOrder tofu = new ProductOrder("두부");
        tofu.setPrice(2000);
        tofu.setQuantity(3);
        orderList.add(tofu);

        ProductOrder kimchi = new ProductOrder("김치");
        kimchi.setPrice(5000);
        kimchi.setQuantity(1);
        orderList.add(kimchi);

        int total = 0;

        for (ProductOrder p : orderList) {
            System.out.print("상품명 : " + p.getProductName());
            System.out.print(", 구매 수량 : " + p.getQuantity());
            System.out.println(", 가격 : " + p.getPrice());
            total += p.totalPrice(p.getPrice(), p.getQuantity());
        }
        System.out.println("=============================");
        System.out.println("총 결제 금액 = " + total);



    }
}
