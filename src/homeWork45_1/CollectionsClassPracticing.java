package homeWork45_1;

import java.util.*;

public class CollectionsClassPracticing {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("yura");
        arrayList.add("yura1");
        arrayList.add("yura2");
        arrayList.add("yura3");
        arrayList.add("yura4");
        arrayList.add("yura5");
        arrayList.add("yura6");
        arrayList.add("yura7");

        ArrayList<String> arrayList2 = new ArrayList<>();

        System.out.println("dianerjoin: " + Collections.disjoint(arrayList, arrayList));

        Iterator<String> it = Collections.emptyIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collections.fill(arrayList, "yura3131");
        System.out.println("vxowdenuy: " + Collections.frequency(arrayList, "yura"));

        System.out.println("podspusok: " + Collections.indexOfSubList(arrayList, arrayList2));

        System.out.println("podspusok: " + Collections.lastIndexOfSubList(arrayList, arrayList));

        System.out.println("Max: " + Collections.max(arrayList));

        System.out.println("Min: " + Collections.min(arrayList));

        Collections.rotate(arrayList, 3);

        Collections.swap(arrayList, 1, 7);

        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println("Метод  по додаванню елементів у колекцію");

        System.out.println(Collections.addAll(arrayList, "gerasum"));


        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();

        arrayDeque.add("yura");

        arrayDeque.add("yura1");

        arrayDeque.add("yura2");

        arrayDeque.add("yura3");

        arrayDeque.add("yura4");

        arrayDeque.add("yura5");

        Queue<String> stack = Collections.asLifoQueue(arrayDeque);

        int binarySearch = Collections.binarySearch(arrayList, "yura3");

        System.out.println("BinarySearch: " + binarySearch);

        Collection<String> collection = Collections.checkedCollection(arrayList, String.class);

        List<String> list = Collections.checkedList(arrayList, String.class);

        for (String item : list) {
            System.out.println(item);
        }


        NavigableSet<String> hashSet = new TreeSet<>();

        hashSet.add("yura");

        hashSet.add("yura1");

        hashSet.add("yura2");

        hashSet.add("yura3");

        hashSet.add("yura4");

        NavigableSet<String> set = Collections.checkedNavigableSet(hashSet, String.class);

        for (String item : set) {
            System.out.println(item);
        }
    }
}
