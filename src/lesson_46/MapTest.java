package lesson_46;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        contacts.put("yura", "0636345830");
        contacts.put("yura1", "0636345831");
        contacts.put("yura2", "0636345833");
        contacts.put("yura", "0636345834534");
        for (Map.Entry<String, String> item : contacts.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.println(key + " " + value);

        }
        System.out.println(contacts);
        System.out.println(contacts.get("yura"));
    }
}
