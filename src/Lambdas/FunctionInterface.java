package Lambdas;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, String> evenOrOdd = number ->
                number % 2 == 0 ? "Even" : "Odd";

        System.out.println(evenOrOdd.apply(32));

        Function<String, String > theResultIs = value ->
                "The result is " + value;

        Function<String, String> excited = value ->
                value + "!!!";

        Function<String, String> doubt = value ->
                value + "???";

        System.out.println(evenOrOdd
                    .andThen(theResultIs)
                    .andThen(excited)
                    .apply(32));

        System.out.println(evenOrOdd
                    .andThen(theResultIs)
                    .andThen(doubt)
                    .apply(32));
    }
}
