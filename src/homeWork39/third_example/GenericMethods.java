package homeWork39.third_example;

import java.util.ArrayList;

public class GenericMethods<T extends Comparable<T>> {

    static <T extends Number>
    void sortingInserts(ArrayList<T> ob) {
        int j;
        for (int i = 0; i < ob.size(); i++) {
            if (ob.get(i).doubleValue() > ob.get(i + 1).doubleValue()) {
                T temp1 = ob.get(i + 1);
                ob.set(i + 1, ob.get(i));
                j = i;
                while (j > 0 && temp1.doubleValue() < ob.get(j - 1).doubleValue()) {
                    ob.set(j, ob.get(j - 1));
                    j--;
                }
                ob.set(j, temp1);
            }
        }
    }

    static <T extends Number>
    void bubbleSort(ArrayList<T> ob) {
        int langs = ob.size();
        for (int i = 0; i < langs - 1; i++) {
            for (int j = 0; j < langs - i - 1; j++) {
                int a;
                if (ob.get(j).doubleValue() > ob.get(j + 1).doubleValue()) {
                    T temp = ob.get(j);
                    ob.set(j, ob.get(j + 1));
                    ob.set(j + 1, temp);
                }
            }
        }
    }

    static <T extends Number>
    void showInfo(ArrayList<T> ob) {
        for (T item : ob) {
            System.out.print(item.toString() + " ");
        }
        System.out.println();
    }
}
