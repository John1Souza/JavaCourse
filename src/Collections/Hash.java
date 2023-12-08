package Collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Users> users = new HashSet<Users>();

        users.add(new Users("Pedro"));
        users.add(new Users("Ana"));
        users.add(new Users("Gui"));

        System.out.println(users.contains(new Users("Gui")));
    }
}
