package Collections;

import ClassesAndMethods.Users;

import java.util.ArrayList;
import java.util.List;

public class ListConcepts {

    public static void main(String[] args) {
        List<Users> list = new ArrayList<>();

        Users u1 = new Users("Ana");
        list.add(u1);

        list.add(new Users("Carlos"));
        list.add(new Users("Lia"));
        list.add(new Users("Bia"));
        list.add(new Users("Manu"));

        System.out.println(list.get(3));

        System.out.println(">>>>>>>" + list.remove(1));
        System.out.println(list.remove(new Users("Manu")));

        System.out.println("Have?" + list.contains((new Users("Lia"))));
        System.out.println("Have?" + list.contains(u1));

        for (Users u :
             list) {
            System.out.println(u.name);
        }
    }

}
