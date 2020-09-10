package homeWork42;

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


        System.out.println("Vector : " + vector.toString());
        vector.add(3, 111);
        System.out.println("Vector : " + vector.toString());
        vector.add(22222);
        System.out.println("Vector : " + vector.toString());
        vector.addAll(vector1);
        System.out.println("Vector : " + vector.toString());
        vector.addAll(2, vector1);
        System.out.println("Vector : " + vector.toString());
        vector.addElement(555);
        System.out.println("Vector : " + vector.toString());
        System.out.println("capacity: " + vector.capacity());
        System.out.println("contains: " + vector.contains(222));
        System.out.println("ContainsAll: " + vector.containsAll(vector2));
        int element = vector.elementAt(6);
        System.out.println("Element po indeksy: " + element);
        System.out.println("Size :" + vector.size());
        System.out.println("Equals two elements: " + vector.equals(vector));
        System.out.println("Firs element: " + vector.firstElement());
        System.out.println("Get return elent with index: " + vector.get(4));
        System.out.println("Hash cod: " + vector.hashCode());
        System.out.println("is empty: " + vector.isEmpty());
        System.out.println("Vector : " + vector.toString());


        vector.set(1, 19081990);
        System.out.println("Vector : " + vector.toString());
        int indexOf = vector.indexOf(5434);
        System.out.println("Inexof: " + indexOf);
        int indOf = vector.indexOf(5, 9);
        System.out.println("IndexOf: " + indOf);
        vector.insertElementAt(1990, 2);
        System.out.println("Vector : " + vector.toString());
        int lastElement = vector.lastElement();
        System.out.println("last element: " + lastElement);
        System.out.println("lastIndexOf: " + vector.lastIndexOf(19081990));
        System.out.println("lastIndexOfWithIndex: " + vector.lastIndexOf(111, 3));
        System.out.println("Remove: " + vector.remove(2));
        System.out.println("Vector : " + vector.toString());
        vector.remove(vector.indexOf(22222));
        System.out.println("Vector : " + vector.toString());
        System.out.println("Vector : " + vector.toString());
        vector.removeElement(3);
        System.out.println("Vector : " + vector.toString());
        vector.removeElementAt(2);
        System.out.println("Vector : " + vector.toString());
        System.out.println("Vector : " + vector.toString());
        vector.setElementAt(1990, 1);
        System.out.println("Vector : " + vector.toString());
        Object ob[] = vector.toArray();
        for (int i = 0; i < ob.length; i++) {
            System.out.print("ob: " + ob[i] + "  ");
        }
        System.out.println(" ");
        Object ob1[] = vector.toArray(ob);
        for (int i = 0; i < ob1.length; i++) {
            System.out.print("ob: " + ob[i] + "  ");
        }
        System.out.println(" ");
        vector.ensureCapacity(50);
        System.out.println("Size : " + vector.size());
        System.out.println("capacity: " + vector.capacity());
        Integer ob2[] = new Integer[vector.size()];
        vector.copyInto(ob2);
        for (int i = 0; i < ob2.length; i++) {
            System.out.print(ob2[i] + "  ");
        }
        System.out.println(" ");
        System.out.println("Vector : " + vector.toString());
        System.out.println("Clone");
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


        System.out.println("Vector : " + arrayList.toString());
        arrayList.add(3, 111);
        System.out.println("Vector : " + arrayList.toString());
        arrayList.add(22222);
        System.out.println("Vector : " + arrayList.toString());
        arrayList.addAll(arrayList3);
        System.out.println("Vector : " + arrayList.toString());
        arrayList.addAll(2, arrayList3);
        System.out.println("Vector : " + arrayList.toString());
        System.out.println("Vector : " + arrayList.toString());

        System.out.println("contains: " + arrayList.contains(222));
        System.out.println("ContainsAll: " + arrayList.containsAll(arrayList2));


        System.out.println("Size :" + arrayList.size());
        System.out.println("Equals two elements: " + arrayList.equals(arrayList));
        System.out.println("Get return elent with index: " + arrayList.get(4));
        System.out.println("Hash cod: " + arrayList.hashCode());
        System.out.println("is empty: " + arrayList.isEmpty());
        arrayList.clear();
        System.out.println("Vector : " + arrayList.toString());
//        arrayList.set(1, 13);
        System.out.println("Vector : " + arrayList.toString());
        int indexOf1 = arrayList.indexOf(5434);
        System.out.println("Inexof: " + indexOf1);


        System.out.println("Vector : " + arrayList.toString());


        System.out.println("lastIndexOf: " + arrayList.lastIndexOf(19081990));

//        System.out.println("Remove: " + arrayList.remove(2));
        System.out.println("Vector : " + arrayList.toString());
//        arrayList.remove(arrayList.indexOf(22222));
        System.out.println("Vector : " + arrayList.toString());
        arrayList.removeAll(arrayList);


        System.out.println("Vector : " + arrayList.toString());
        arrayList.trimToSize();
        System.out.println("Vector : " + arrayList.toString());

        System.out.println("Size :" + arrayList.size());
        System.out.println("retainAll: " + arrayList.retainAll(arrayList3));

        System.out.println("Vector : " + arrayList.toString());
        Object objectOne[] = arrayList.toArray();
        for (int i = 0; i < objectOne.length; i++) {
            System.out.print("ob: " + objectOne[i] + "  ");
        }
        System.out.println(" ");
        Object ob5[] = arrayList.toArray(objectOne);
        for (int i = 0; i < ob5.length; i++) {
            System.out.print("ob: " + ob5[i] + "  ");
        }
        System.out.println(" ");
        arrayList.ensureCapacity(50);
        System.out.println("Size : " + arrayList.size());
        for (int i = 0; i < ob2.length; i++) {
            System.out.print(ob2[i] + "  ");
        }
        System.out.println(" ");
        System.out.println("Vector : " + arrayList.toString());
        System.out.println("Clone");
        ListIterator<Integer> listIterator1 = arrayList.listIterator();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(listIterator1.next() + "   ");
        }
    }
}
