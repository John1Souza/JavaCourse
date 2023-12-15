package Lambdas;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<Product> isExpensive = product ->
                (product.price * (1 - product.discount)) >= 750;
        Product product = new Product("Notebook", 3950.9, 0.15);
        System.out.println(isExpensive.test(product));
    }
}
