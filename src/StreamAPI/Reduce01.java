package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(
                1, 2, 3, 4,
                5, 6, 7, 8,
                9);

        BinaryOperator<Integer> sum = (ac, n) -> ac + n;

        int total = nums
                .stream()
                .reduce(sum)
                .get();
        System.out.println(total);

        Integer tot01 = nums
                .stream()
                .reduce(100, sum);
        System.out.println(tot01);


        // Resultado foi um Opcional<Integer>...
        nums.stream()
                .filter(n -> n > 5)
                .reduce(sum)
                .ifPresent(System.out::println);
    }
}
