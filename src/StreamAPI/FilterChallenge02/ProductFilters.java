package StreamAPI.FilterChallenge02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProductFilters {
    public static void main(String[] args) {
        Product productOne = new Product("Notebook", 3589.90, 0.5, "Free");
        Product productTwo = new Product("Pen", 9.90, 0.65, "Paid");
        Product productThree = new Product("TV", 4689.00, 0.45, "Free");
        Product productFour = new Product("Smartphone", 2500.00, 0.25, "Paid");
        Product productFive = new Product("iMac", 15589.90, 0.55, "Free");

        List<Product> productList = Arrays.asList(productOne
                , productTwo
                , productThree
                , productFour
                , productFive);

        Predicate<Product> productDiscount = a -> a.discount >= 0.3;
        Predicate<Product> productShipping = a -> a.shippingMethod.equals("Free");

        Function<Product, String> greatAnnouncment =
                p -> "The product: " + p.name + " ,for only R$ " + p.price + ", the manager is crazy!!!";

        productList.stream()
                .filter(productDiscount)
                .filter(productShipping)
                .map(greatAnnouncment)
                .forEach(System.out::println);
    }
}
