package learn_linkedlist_linkedlist_in_stack_stack_in_linkedlist_and_vector.second_example;

import java.util.*;

public class WorkWithVector {

    public static void main(String[] args) {

        Vector<Integer> vector1 = new Vector<>();
        vector1.add(1);
        vector1.add(2);

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(12332);
        vector2.add(2444323);

        Vector<Integer> vector = new Vector<>(25);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(5);


        System.out.println("vector : " + vector.toString());
        vector.add(3, 111);
        System.out.println("vector : " + vector.toString());
        vector.add(22222);
        System.out.println("vector : " + vector.toString());
        vector.addAll(vector1);
        System.out.println("vector : " + vector.toString());
        vector.addAll(2, vector1);
        System.out.println("vector : " + vector.toString());
        vector.addElement(555);
        System.out.println("vector : " + vector.toString());
        System.out.println("capacity: " + vector.capacity());
        System.out.println("contains: " + vector.contains(222));
        System.out.println("ContainsAll: " + vector.containsAll(vector2));
        int element = vector.elementAt(6);
        System.out.println("Element po index: " + element);
        System.out.println("size :" + vector.size());
        System.out.println("Equals two elements: " + vector.equals(vector));
        System.out.println("Firs element: " + vector.firstElement());
        System.out.println("Get return element with index: " + vector.get(4));
        System.out.println("HashCode: " + vector.hashCode());
        System.out.println("is empty: " + vector.isEmpty());
        System.out.println("vector : " + vector.toString());


        vector.set(1, 19081990);
        System.out.println("vector : " + vector.toString());
        int indexOf = vector.indexOf(5434);
        System.out.println("IndexOf: " + indexOf);
        int indOf = vector.indexOf(5, 9);
        System.out.println("IndexOf: " + indOf);
        vector.insertElementAt(1990, 2);
        System.out.println("vector : " + vector.toString());
        int lastElement = vector.lastElement();
        System.out.println("last element: " + lastElement);
        System.out.println("lastIndexOf: " + vector.lastIndexOf(19081990));
        System.out.println("lastIndexOfWithIndex: " + vector.lastIndexOf(111, 3));
        System.out.println("remove: " + vector.remove(2));
        System.out.println("vector : " + vector.toString());
        vector.remove(vector.indexOf(22222));
        System.out.println("vector : " + vector.toString());
        System.out.println("vector : " + vector.toString());
        vector.removeElement(3);
        System.out.println("vector : " + vector.toString());
        vector.removeElementAt(2);
        System.out.println("vector : " + vector.toString());
        System.out.println("vector : " + vector.toString());
        vector.setElementAt(1990, 1);
        System.out.println("vector : " + vector.toString());
        Object[] ob = vector.toArray();
        for (Object anOb : ob) {
            System.out.print("ob: " + anOb + "  ");
        }
        System.out.println(" ");
        Object ob1[] = vector.toArray(ob);
        for (int i = 0; i < ob1.length; i++) {
            System.out.print("ob: " + ob[i] + "  ");
        }
        System.out.println(" ");
        vector.ensureCapacity(50);
        System.out.println("size : " + vector.size());
        System.out.println("capacity: " + vector.capacity());
        Integer[] ob2 = new Integer[vector.size()];
        vector.copyInto(ob2);
        for (Integer anOb2 : ob2) {
            System.out.print(anOb2 + "  ");
        }
        System.out.println(" ");
        System.out.println("vector : " + vector.toString());
        System.out.println("clone");
        ListIterator<Integer> listIterator = vector.listIterator();
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(listIterator.next() + "   ");
        }
        System.out.println(" ");


        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(1);
        arrayList3.add(2);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(12332);
        arrayList2.add(2444323);

        ArrayList<Integer> arrayList = new ArrayList<>(25);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);


        System.out.println("vector : " + arrayList.toString());
        arrayList.add(3, 111);
        System.out.println("vector : " + arrayList.toString());
        arrayList.add(22222);
        System.out.println("vector : " + arrayList.toString());
        arrayList.addAll(arrayList3);
        System.out.println("vector : " + arrayList.toString());
        arrayList.addAll(2, arrayList3);
        System.out.println("vector : " + arrayList.toString());
        System.out.println("vector : " + arrayList.toString());

        System.out.println("contains: " + arrayList.contains(222));
        System.out.println("containsAll: " + arrayList.containsAll(arrayList2));


        System.out.println("size :" + arrayList.size());
        System.out.println("equals two elements: " + arrayList.equals(arrayList));
        System.out.println("Get return element with index: " + arrayList.get(4));
        System.out.println("HashCode: " + arrayList.hashCode());
        System.out.println("is empty: " + arrayList.isEmpty());
        arrayList.clear();
        System.out.println("vector : " + arrayList.toString());
        System.out.println("vector : " + arrayList.toString());
        int indexOf1 = arrayList.indexOf(5434);
        System.out.println("indexOf: " + indexOf1);

        System.out.println("vector : " + arrayList.toString());

        System.out.println("lastIndexOf: " +
                arrayList.lastIndexOf(19081990));

        System.out.println("vector : " + arrayList.toString());

        System.out.println("vector : " + arrayList.toString());

        arrayList.removeAll(arrayList);


        System.out.println("vector : " + arrayList.toString());
        arrayList.trimToSize();
        System.out.println("vector : " + arrayList.toString());

        System.out.println("size :" + arrayList.size());
        System.out.println("retainAll: " + arrayList.retainAll(arrayList3));

        System.out.println("vector : " + arrayList.toString());
        Object[] objectOne = arrayList.toArray();
        for (Object anObjectOne : objectOne) {
            System.out.print("ob: " + anObjectOne + "  ");
        }
        System.out.println(" ");
        Object[] ob5 = arrayList.toArray(objectOne);
        for (Object anOb5 : ob5) {
            System.out.print("ob: " + anOb5 + "  ");
        }
        System.out.println(" ");
        arrayList.ensureCapacity(50);
        System.out.println("size : " + arrayList.size());
        for (Integer anOb2 : ob2) {
            System.out.print(anOb2 + "  ");
        }
        System.out.println(" ");
        System.out.println("vector : " + arrayList.toString());
        System.out.println("clone");
        ListIterator<Integer> listIterator1 = arrayList.listIterator();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(listIterator1.next() + "   ");
        }
    }
}
