package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] po = new ProductOrder[3];
        ProductOrder order1 = new ProductOrder();
        ProductOrder order2 = new ProductOrder();
        ProductOrder order3 = new ProductOrder();

        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        po[0] = order1;

        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        po[1] = order2;

        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        po[2] = order3;

        int totalAmount = 0;
        for(ProductOrder p : po){
            totalAmount += p.price * p.quantity;
            System.out.println("상품명 : " + p.productName + ", 가격 : " + p.price + ", 수량 : " + p.quantity);
        }
        System.out.println("총 결제 금액 : " + totalAmount);
    }
}
