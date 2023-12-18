package StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapChallenge {
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

        // 1 - Numero para string binaria... 6 => "110"
        nums.stream().map(MapChallengeMethods.value)
                .map(MapChallengeMethods::returnQuotient)
                .forEach(print);

        // 2 - Inverter a string... "110" => "011"
        nums.stream()
                .map(MapChallengeMethods::returnQuotient)
                .map(MapChallengeMethods::returnQuotientInverted)
                .forEach(print);
    }
}
