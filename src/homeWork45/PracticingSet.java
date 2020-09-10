package homeWork45;

import java.util.*;

public class PracticingSet {
    public static void main(String[] args) {
        SortedSet<String> stringSortedSet = new TreeSet<>();

        stringSortedSet.add("yura");

        stringSortedSet.add("bahlay");

        stringSortedSet.add("nastja");

        stringSortedSet.add("oleg");

        stringSortedSet.add("katja");

        stringSortedSet.add("sofija");

        stringSortedSet.add("masha");

        String firstElement = stringSortedSet.first();

        System.out.println("first: " + firstElement);

        System.out.println("lastelement: " + stringSortedSet.last());

        System.out.println("count: " + stringSortedSet.size());

        System.out.println("Чи присутне: " + stringSortedSet.contains("yur1a"));

        SortedSet<String> stringSortedSet1 = new TreeSet<>();

        stringSortedSet.add("yura");

        stringSortedSet.add("bahlay");

        stringSortedSet.add("nastja");

        stringSortedSet.add("oleg");

        System.out.println(stringSortedSet.addAll(stringSortedSet1));

        System.out.println("set: " + stringSortedSet.containsAll(stringSortedSet1));

        int hash = stringSortedSet.hashCode();

        System.out.println("Hash cod: " + hash);

        stringSortedSet.clear();

        System.out.println("count: " + stringSortedSet.size());

        System.out.println("isEmpty: " + stringSortedSet.isEmpty());

        SortedSet<String> stringSortedSet2 = new TreeSet<>();

        stringSortedSet2 = stringSortedSet.headSet("nastja");

        SortedSet<String> stringSortedSet3 = new TreeSet<>();

        stringSortedSet3 = stringSortedSet.subSet("nastja", "oleg");

        System.out.println("remove: " + stringSortedSet.remove("yura"));

        stringSortedSet3 = stringSortedSet.tailSet("nastja");

        System.out.println("remove all :" + stringSortedSet.removeAll(stringSortedSet1));

        stringSortedSet.retainAll(stringSortedSet);

        System.out.println("equals: " + stringSortedSet.equals(stringSortedSet1));

        Object[] object = stringSortedSet.toArray();

        for (int i = 0; i < object.length; i++) {
            System.out.println(object[i].toString());
        }

        String[] strings = new String[7];

        Object[] objects = stringSortedSet.toArray(strings);


        System.out.println(stringSortedSet.toString());

        Iterator<String> ob = stringSortedSet.iterator();

        while (ob.hasNext()) {
            System.out.println(ob.next());
        }

        NavigableSet<String> navigableSet = new TreeSet<>();

        navigableSet.add("yura");

        navigableSet.add("bahlay");

        navigableSet.add("nastja");

        navigableSet.add("oleg");

        navigableSet.add("katja");

        navigableSet.add("sofija");

        navigableSet.add("masha");

        System.out.println(navigableSet.toString());

        System.out.println(navigableSet.toString());


        Iterator<String> it = navigableSet.descendingIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        NavigableSet<String> navigableSetTwo = new TreeSet<>();

        navigableSetTwo = navigableSetTwo.descendingSet();

        System.out.println(navigableSetTwo.toString());

        SortedSet<String> stringSorted = new TreeSet<>();

        stringSorted = navigableSetTwo.headSet("masha");

        System.out.println(stringSorted.toString());

        NavigableSet<String> strings1 = new TreeSet<>();

        strings1 = navigableSetTwo.headSet("nastja", true);

        System.out.println(strings1.toString());

        System.out.println(navigableSetTwo.toString());

        SortedSet<String> setFour = new TreeSet<>();

        setFour = navigableSetTwo.tailSet("oleg");

        System.out.println(setFour.toString());

        System.out.println(navigableSetTwo.toString());
    }
}
