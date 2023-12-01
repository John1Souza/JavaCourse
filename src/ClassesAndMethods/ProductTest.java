package ClassesAndMethods;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Notebook";
        p1.price = 4356.89;
        p1.discount = 0.25;

        var p2 = new Product();
        p2.name = "Black pen";
        p2.price = 12.35;
        p2.discount = 0.29;

        System.out.println(p1.name);
        System.out.println(p2.name);

        double finalPrice = p1.price * (1 - p1.discount);
        double finalPrice1 = p2.price * (1 - p2.discount);
        double cartAverage = (finalPrice + finalPrice1)/ 2;


        System.out.printf("Cart average = R$%.2f.", cartAverage);
    }
}
