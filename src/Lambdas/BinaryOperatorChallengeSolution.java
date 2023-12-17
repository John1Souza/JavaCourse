package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperatorChallengeSolution {
    public static void main(String[] args) {

        Function<Product, Double> finalPrice =
                prod -> prod.price * (1 - prod.discount);
        UnaryOperator<Double> municipalTax =
                price -> price >= 2500 ? price * 1.085 : price;
        UnaryOperator<Double> shipping =
                price -> price >= 3000 ? price + 100 : price + 50;
        UnaryOperator<Double> round =
                price -> Double.parseDouble(String.format("%.2f", price));
        Function<Double, String> format =
                price -> ("R$ " + price).replace(".", ",");

        Product p = new Product("iPad", 3235.89, 0.13);

        String price = finalPrice
                .andThen(municipalTax)
                .andThen(shipping)
                .andThen(round)
                .andThen(format)
                .apply(p);
        System.out.println("The final price is " + price);
    }
}
