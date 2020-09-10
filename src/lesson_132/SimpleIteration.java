package lesson_132;

import java.util.*;

public class SimpleIteration {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer(1),
                new Integer(2), new Integer(3), new Integer(4)));

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(" iterator: " + i);
        }

        System.out.println();

        for (Integer i : list) {
            System.out.println("foreach: " + i);
        }

        System.out.println();

        iterator = list.iterator();
        for (int i = 0; i < 4; i++) {
            iterator.next();
            iterator.remove();
        }

        System.out.println("list: " + list);
    }
}
