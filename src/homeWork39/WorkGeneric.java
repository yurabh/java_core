package homeWork39;

import java.util.ArrayList;

public abstract class WorkGeneric<T extends Number> {

    protected ArrayList<T> numberList;

    public WorkGeneric() {
        this.numberList = new ArrayList<>();
    }

    public abstract void insertIntoSort();

    public abstract void addElement();

    protected abstract int FindElement();

    public void removeElement() {
        int index = FindElement();
        if (index != -1) {
            System.out.println("Ми знайшли елемент і видаляем йього: " + numberList.get(index).toString());
            numberList.remove(index);
        } else {
            System.out.println("Елемент не знайщовся для видалення");
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
