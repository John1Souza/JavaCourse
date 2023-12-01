package ClassesAndMethods;

public class ProductTestMethod {
    public static void main(String[] args) {
        ProductMethod p1 = new ProductMethod();
        p1.name = "Notebook";
        p1.price = 4356.89;
        p1.discount = 0.25;

        var p2 = new ProductMethod();
        p2.name = "Black pen";
        p2.price = 12.35;
        p2.discount = 0.29;

        System.out.println(p1.name);
        System.out.println(p2.name);

        double finalPrice = p1.priceWithDiscount();
        double finalPrice1 = p2.priceWithDiscount(0.35);
        double cartAverage = (finalPrice + finalPrice1)/ 2;


        System.out.printf("Cart average = R$%.2f.", cartAverage);
    }
}
