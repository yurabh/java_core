package learn_set.first_example;

import java.util.*;

public class PractisingSet {

    public static void main(String[] args) {

        SortedSet<String> stringSortedSet = new TreeSet<>();

        stringSortedSet.add("v");

        stringSortedSet.add("s");

        stringSortedSet.add("g");

        stringSortedSet.add("r");

        stringSortedSet.add("y");

        stringSortedSet.add("a");

        stringSortedSet.add("l");

        String firstElement = stringSortedSet.first();

        System.out.println("first: " + firstElement);

        System.out.println("lastElement: " + stringSortedSet.last());

        System.out.println("count: " + stringSortedSet.size());

        System.out.println("isPresent: " + stringSortedSet.contains("v"));

        SortedSet<String> stringSortedSet1 = new TreeSet<>();

        stringSortedSet.add("d");

        stringSortedSet.add("v");

        stringSortedSet.add("r");

        stringSortedSet.add("o");

        System.out.println(stringSortedSet.addAll(stringSortedSet1));

        System.out.println("set: " + stringSortedSet.containsAll(stringSortedSet1));

        int hash = stringSortedSet.hashCode();

        System.out.println("hash code: " + hash);

        stringSortedSet.clear();

        System.out.println("count: " + stringSortedSet.size());

        System.out.println("isEmpty: " + stringSortedSet.isEmpty());

        System.out.println("remove: " + stringSortedSet.remove("v"));

        System.out.println("remove all :" + stringSortedSet.removeAll(stringSortedSet1));

        stringSortedSet.retainAll(stringSortedSet);

        System.out.println("equals: " + stringSortedSet.equals(stringSortedSet1));

        Object[] object = stringSortedSet.toArray();

        for (int i = 0; i < object.length; i++) {
            System.out.println(object[i].toString());
        }

        System.out.println(stringSortedSet.toString());

        Iterator<String> ob = stringSortedSet.iterator();

        while (ob.hasNext()) {
            System.out.println(ob.next());
        }

        NavigableSet<String> navigableSet = new TreeSet<>();

        navigableSet.add("c");

        navigableSet.add("a");

        navigableSet.add("f");

        navigableSet.add("h");

        navigableSet.add("q");

        navigableSet.add("k");

        navigableSet.add("s");

        System.out.println(navigableSet.toString());

        Iterator<String> it = navigableSet.descendingIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        NavigableSet<String> navigableSetTwo = new TreeSet<>();

        navigableSetTwo = navigableSetTwo.descendingSet();

        System.out.println(navigableSetTwo.toString());
    }
}
