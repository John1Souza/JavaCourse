package Collections;

import java.util.HashSet;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(1.2);
        set.add(true);
        set.add("teste");
        set.add(1);
        set.add('x');

        System.out.println("Size of set is " + set.size());

        set.add("Teste");
        set.add('x');
        System.out.println("Size of set is " + set.size());

        System.out.println(set.remove("teste"));
        System.out.println(set.remove("Teste"));
        System.out.println(set.remove('x'));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(set);

        set.retainAll(nums);
        System.out.println(set);
    }
}
