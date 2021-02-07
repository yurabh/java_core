package learn_generic.forth_example;

import java.util.ArrayList;

public abstract class WorkWithGeneric<T extends Identify<Integer>, V> implements Findable<T, V> {

    protected ArrayList<T> numbersList;

    public WorkWithGeneric() {
        this.numbersList = new ArrayList<>();
    }

    public abstract void bubbleSort();

    public abstract void addElement();

    public abstract T find(V key);

    public void showInfo() {
        System.out.println(" ");
        for (T i : numbersList) {
            System.out.println("number: " + i.toString());
        }
        System.out.println(" ");
    }

    public void remove(V key) {
        T value = find(key);
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == value) {
                System.out.println("Remove Ob: " + numbersList.get(i).toString());
                numbersList.remove(i);
            }
        }
    }
}
