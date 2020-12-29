package learn_arrays_and_collections;

import java.util.*;

public class CollectionsClassPracticing {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.add("s");
        arrayList.add("c");

        System.out.println("disjoint: " + Collections.disjoint(arrayList, arrayList));

        Iterator<String> it = Collections.emptyIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collections.fill(arrayList, "b");

        System.out.println("Max: " + Collections.max(arrayList));

        System.out.println("Min: " + Collections.min(arrayList));

        Collections.rotate(arrayList, 3);

        Collections.swap(arrayList, 1, 7);

        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println(Collections.addAll(arrayList, "b"));

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("a");
        arrayDeque.add("b");
        arrayDeque.add("c");
        arrayDeque.add("d");
        arrayDeque.add("e");
        arrayDeque.add("d");

        Queue<String> stack = Collections.asLifoQueue(arrayDeque);

        int binarySearch = Collections.binarySearch(arrayList, "b");

        System.out.println("BinarySearch: " + binarySearch);

        Collection<String> collection = Collections.checkedCollection(arrayList, String.class);

        List<String> list = Collections.checkedList(arrayList, String.class);

        for (String item : list) {
            System.out.println(item);
        }

        NavigableSet<String> hashSet = new TreeSet<>();

        hashSet.add("a");
        hashSet.add("v");
        hashSet.add("f");
        hashSet.add("g");
        hashSet.add("j");

        NavigableSet<String> set = Collections.checkedNavigableSet(hashSet, String.class);

        for (String item : set) {
            System.out.println(item);
        }
    }
}
