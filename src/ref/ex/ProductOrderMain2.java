package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 1500, 1);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1000, 2);

        printOrders(orders);
        System.out.println("총 금액 : " + getTotalAmount(orders) + "원");

    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder o : orders) {
            System.out.println("상품명 : " + o.productName + ", 가격 : " + o.price + ", 수량 : " + o.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder o : orders) {
            totalAmount += o.price * o.quantity;
        }
        return totalAmount;
    }
}
