package Challenges;

import ClassesAndMethods.ProductMethod;

public class ProductClassVSInstanceTest {
    public static void main(String[] args) {
        ProductClassVSInstance p1 = new ProductClassVSInstance("Notebook", 4356.89);
        // p1.name = "Notebook";
        // p1.price = 4356.89;
        // p1.discount = 0.25;

        var p2 = new ProductClassVSInstance();
        p2.name = "Black pen";
        p2.price = 12.35;
        //p2.discount = 0.29;

        System.out.println(p1.name);
        System.out.println(p2.name);

        ProductClassVSInstance.discount = 0.65;


        double finalPrice = p1.priceWithDiscount();
        double finalPrice1 = p2.priceWithDiscount();
        double cartAverage = (finalPrice + finalPrice1)/ 2;

        System.out.printf("Your product price is R$ %.2f, with the store discount" +
                " the price is R$ %.2f", p1.price, finalPrice);
        System.out.printf("\nYour product price is R$ %.2f, with the store discount" +
                " the price is R$ %.2f", p2.price, finalPrice1);
        System.out.printf("\nCart average = R$%.2f.", cartAverage);


    }
}
