package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapChallengeSolution {
    public static void main(String[] args) {

        Consumer<Object> print = System.out::println;


        //1,2,3,4,5,6,7,8,9
        List<Integer> nums = Arrays.asList(
                1,2,3,4,5,6,7,8,9
        );

        /*
        * 1 - Numero para string binaria... 6 => "110"
        * 2 - Inverter a string... "110" => "011"
        * 3 - Converter de volta para inteiro => "011" => 3
        *
        * Integer.
        * */

        //1 - Numero para string binaria... 6 => "110"

        // 2 - Inverter a string... "110" => "011"

        // 3 - Converter de volta para inteiro => "011" => 3

        UnaryOperator<String> invert =
                text -> new StringBuilder(text).reverse().toString();

        Function<String, Integer> binaryToInt =
                s -> Integer.parseInt(s, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(invert)
                .map(binaryToInt)
                .forEach(System.out::println);
    }
}
