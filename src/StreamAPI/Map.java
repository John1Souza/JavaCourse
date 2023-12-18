package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> brand = Arrays.asList("BMW ", "Audi ","Honda ");

        brand.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println(Utilitaries.upperCase
                .andThen(Utilitaries.firstLetter)
                .andThen(Utilitaries::shout)
                .apply("BMW"));

        System.out.println("\n\nUsing composition...");
        brand.stream().map(Utilitaries.upperCase)
                .map(Utilitaries.firstLetter)
                .map(Utilitaries::shout)
                .forEach(print);
    }
}
