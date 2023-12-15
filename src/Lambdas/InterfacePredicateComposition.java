package Lambdas;

import java.util.function.Predicate;

public class InterfacePredicateComposition {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> hasThreeDigits = num -> num >= 100 && num <= 999;

        System.out.println(isEven.and(hasThreeDigits).negate().test(122));

    }
}
