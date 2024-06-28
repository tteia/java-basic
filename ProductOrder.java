package 클래스와_데이터;

public class ProductOrder {
    private String productName;
    private int price;
    private int quantity;
    int totalPrice;

    public ProductOrder(String productName){
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int totalPrice(int price, int quantity){
        this.price = price;
        this.quantity = quantity;
        totalPrice = price * quantity;
        return totalPrice;
    }
}
