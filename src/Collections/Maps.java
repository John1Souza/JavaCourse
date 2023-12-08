package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();

        users.put(1, "Robert");
        users.put(2, "Rafaela");
        users.put(20, "Ricard");
        users.put(3, "Rebeca");

        System.out.println(users.size());
        System.out.println(users.isEmpty());

        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.entrySet());

        System.out.println(users.containsKey(20));
        System.out.println(users.containsValue("Rebeca"));

        System.out.println(users.get(20));

        for (int chave: users.keySet()) {
            System.out.println(chave);
        }

        for(String value: users.values()){
            System.out.println(value);
        }

        for(Entry<Integer, String> registry: users.entrySet()){
            System.out.print(registry.getKey() + " ==> ");
            System.out.println(registry.getValue());
        }
    }
}
