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

        //1 - Numero para string binaria... 6 => "110"
        System.out.println("<==================>");
        System.out.println("Int to BinaryString");
        System.out.println("<==================>");
        nums.stream().map(MapChallengeMethods::returnBinaryString)
                .forEachOrdered(string -> {
                    System.out.printf("| %s ", string);
                });

        // 2 - Inverter a string... "110" => "011"
        System.out.println("\n<==================>");
        System.out.println("Reverse BinaryString");
        System.out.println("<==================>");
        nums.stream()
                .map(MapChallengeMethods::returnBinaryString)
                .map(MapChallengeMethods::returnQuotientInverted)
                .forEachOrdered(string -> {
                    System.out.printf("| %s ", string);
                });

        // 3 - Converter de volta para inteiro => "011" => 3
        System.out.println("\n<==================>");
        System.out.println("BinaryString to Int");
        System.out.println("<==================>");
        nums.stream()
                .map(MapChallengeMethods::returnBinaryString)
                .map(MapChallengeMethods::retrunToNumber)
                .forEachOrdered(number -> {
                    System.out.printf("| %d ", number);
                });


        //.forEach(print);

    }
}
