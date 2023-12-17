package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {

        Consumer<Object> print = System.out::print;
        Consumer<Integer> println = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] moreLangs = {"Pyhton ", "Lisp ", "Perl ","Go\n" };
        Stream.of(moreLangs).forEach(print);

        Arrays.stream(moreLangs).forEach(print);
        Arrays.stream(moreLangs, 1, 4).forEach(print);

        List<String> otherLanguages = Arrays.asList("C ", "PHP ", "Kotlin\n");
        //otherLanguages.forEach(print);
        otherLanguages.stream().forEach(print);
        otherLanguages.parallelStream().forEach(print);

        // Gerar stram infinito
        //Stream.generate(() -> "a").forEach(print);
        //Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
