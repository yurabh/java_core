package learn_generic.first_example;

import java.util.ArrayList;

public abstract class WorkGeneric<T extends Number> {

    protected ArrayList<T> numberList;

    public WorkGeneric() {
        this.numberList = new ArrayList<>();
    }

    public abstract void insertIntoSort();

    public abstract void addElement();

    protected abstract int findElement();

    public void removeElement() {
        int index = findElement();
        if (index != -1) {
            System.out.println("Find element and remove it: "
                    + numberList.get(index).toString());
            numberList.remove(index);
        } else {
            System.out.println("could't find element");
        }
    }

    public void showInfo() {
        System.out.println(" ");
        for (T i : numberList) {
            System.out.println("number: " + i.toString());
        }
        System.out.println(" ");
    }
}
