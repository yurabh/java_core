package learn_map.first_example;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {

        Map<String, String> contacts = new HashMap<>();
        contacts.put("a", "060");
        contacts.put("b", "063");
        contacts.put("c", "066");
        contacts.put("d", "064");

        for (Map.Entry<String, String> item : contacts.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.println(key + " " + value);

        }
        System.out.println(contacts);
        System.out.println(contacts.get("a"));
    }
}
