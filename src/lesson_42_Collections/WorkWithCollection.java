package lesson_42_Collections;

import java.util.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class WorkWithCollection {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(111);

        arrayList.add(222);

        arrayList.add(333);

        arrayList.add(444);


        System.out.println("Iterator");

        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "  ");
        }

        System.out.println("ListIterator");

        ListIterator<Integer> listIterator = arrayList.listIterator();

        System.out.println("З початку до кінця");

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + "  ");
            System.out.println("index: " + listIterator.nextIndex());
        }

        listIterator.add(66);


        System.out.println("З заду наперед");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
            System.out.println("indexprevies: " + listIterator.previousIndex());

        }

        listIterator = arrayList.listIterator();
        System.out.println("Видалення елемента");
        while (listIterator.hasNext()) {
            Integer value = listIterator.next();
            if (value == 444) {
                listIterator.remove();
            } else {
                System.out.println(value + "  ");
            }
        }


        System.out.println("Lesson_42");
        Collection<Integer> numers = new Vector<>();
        numers.add(1);
        numers.add(14);
        numers.add(13);
        numers.add(12);


        List<Integer> numbersTwo = new Vector<>();
        numbersTwo.add(1);
        numbersTwo.add(14);
        numbersTwo.add(13);
        numbersTwo.add(12);

        for (int i = 0; i < numbersTwo.size(); i++) {
            System.out.println("element: " + numbersTwo.get(i));
        }


        Iterator<Integer> it = numers.iterator();
        while (it.hasNext()) {
            int value = it.next();
            System.out.println(value);
            if (value == 14) {
                it.remove();
            }
        }

        System.out.println("Після видалення");
        it = numers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }


        System.out.println("ArrayList");
        Collection<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(14);
        numbers2.add(13);
        numbers2.add(12);

        Iterator<Integer> it1 = numbers2.iterator();
        System.out.println("array sout");
        while (it1.hasNext()) {
            int value = it1.next();
            if (value == 13) {
                it1.remove();
            } else {
                System.out.println(value);
            }
        }
    }
}
