package StreamAPI.FilterChallenge02;

public class Product {
    final String name;
    final double price;
    final double discount;
    final String shippingMethod;
    public Product(String name, double price, double discount, String shippingMethod) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.shippingMethod = shippingMethod;
    }
}
