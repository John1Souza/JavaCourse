package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorConcepts {
    public static void main(String[] args) {
        BinaryOperator<Double> mean =
                (n1, n2) -> (n1 + n2) / 2;

        System.out.println(mean.apply(9.8, 5.7));

        BiFunction<Double, Double, String> result =
                (n1, n2) -> ((n1 + n2) /2) >= 7 ? "Approved" : "Disapproved";

        System.out.println(result.apply(9.6, 4.1));

        Function<Double, String> concept = m -> m >= 7 ? "Approved" : "Disapproved";
        System.out.println(mean.andThen(concept).apply(9.6, 5.0));

    }
}
