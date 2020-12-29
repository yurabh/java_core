package homeWork39.lesson_41_Generick_Intarface;

import java.util.Random;

public class OrderList extends WorkWithGeneric<Order, Integer> {

    @Override
    public void bubbleSort() {
        int length = numbersList.size();
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (numbersList.get(j).getId() > numbersList.get(j + 1).getId()) {

                    Order temp = numbersList.get(j);
                    numbersList.set(j, numbersList.get(j + 1));
                    numbersList.set(j + 1, temp);
                }
            }
            System.out.println();
        }
    }

    @Override
    public void addElement() {
        Random rand = new Random();
        numbersList.add(new Order(rand.nextInt(48) + 3));
    }

    public Order find(Integer key) {
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i).getId() == key) {
                System.out.println();
                System.out.print("Ми знайшли елемент: " + numbersList.get(i).toString());
                System.out.println(" ");
                return numbersList.get(i);
            }
        }
        return null;
    }
}
