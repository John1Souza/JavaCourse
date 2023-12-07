package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetConcepts {
    public static void main(String[] args) {
        //Set<String> approvedList = new HashSet<>();
        SortedSet<String> approvedList = new TreeSet<>();
        approvedList.add("Ana");
        approvedList.add("Carlos");
        approvedList.add("Luca");
        approvedList.add("Pedro");

        for(String candidate: approvedList){
            System.out.println(candidate);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

    }
}
