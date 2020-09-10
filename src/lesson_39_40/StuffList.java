package lesson_39_40;

import java.util.ArrayList;

public class StuffList<T extends Number> {
    private ArrayList<T> stuff;

    public StuffList(ArrayList<T> stuff) {
        this.stuff = stuff;
    }

    public void bubbleSort() {
        int length = stuff.size();
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (stuff.get(j).doubleValue() > stuff.get(j + 1).doubleValue()) {
                    T temp = stuff.get(j);
                    stuff.set(j, stuff.get(j + 1));
                    stuff.set(j + 1, temp);
                }
            }
        }
    }

    private double getAverage() {

        double sum = 0;
        for (T item : stuff) {
            sum += item.doubleValue();
        }
        return sum / stuff.size();
    }


    public boolean sameAverage(StuffList<?> list) {

        if (this.getAverage() == list.getAverage()) {
            return true;
        } else {
            return false;
        }
    }


    public void showInfo() {
        for (T item : stuff) {
            System.out.print(item.toString() + " ");
        }
        System.out.println();
    }
}