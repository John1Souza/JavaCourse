package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class PrintObjects {
    public static void main(String[] args) {
        List<String> approved = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("Using ForEach");
        for (String name: approved){
            System.out.println(name);
        }
    }
}
