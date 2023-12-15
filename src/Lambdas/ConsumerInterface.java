package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<Product> print = product ->
                System.out.println(product.name + "!!!");
        Product product1 = new Product("Pen", 12.34, 0.09);
        print.accept(product1);

        Product product2 = new Product("Notebook", 738.89, 0.15);
        Product product3 = new Product("Note Pad", 123.34, 0.10);
        Product product4 = new Product("Ipad", 345.65, 0.25);
        Product product5 = new Product("IMac", 2350.90, 0.11);

        List<Product> productList = Arrays.asList(product1, product2,
                product3, product4, product5);

        productList.forEach(print);

        productList.forEach(p -> System.out.println(p.price));
        productList.forEach(System.out::println);
    }
}
