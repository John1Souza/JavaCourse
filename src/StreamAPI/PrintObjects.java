package StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintObjects {
    public static void main(String[] args) {
        List<String> approved = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("Using ForEach");
        for (String name: approved){
            System.out.println(name);
        }
        System.out.println("\nUsing Iterator");
        Iterator<String> iterator = approved.iterator();
        while(iterator.hasNext()) System.out.println(iterator.next());

        System.out.println("\nUsing Stream");
        Stream<String> stream = approved.stream();
        stream.forEach(System.out::println);
    }


}
