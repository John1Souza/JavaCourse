package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<List<String>> oneList = () ->
                Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println(oneList.get());
    }
}
