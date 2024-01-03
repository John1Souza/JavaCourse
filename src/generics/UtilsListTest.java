package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilsListTest {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS","PHP","Java","C++");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        String lastLanguage = (String) UtilsList.getLastOne(langs);
        System.out.println(lastLanguage);

        Integer lastNumber = (Integer) UtilsList.getLastOne(nums);
        System.out.println(lastNumber);

        String lastLanguage2 = UtilsList.getLastTwo(langs);
        System.out.println(lastLanguage2);

        Integer lastNumber2 = UtilsList.getLastTwo(nums);
        System.out.println(lastNumber2);

    }
}
