package learn_generic.forth_example;

import java.util.Random;

public class ProductList extends WorkWithGeneric<Product, Integer> {

    @Override
    public void bubbleSort() {
        int length = numbersList.size();
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (numbersList.get(j).getId() > numbersList.get(j + 1).getId()) {
                    Product temp = numbersList.get(j);
                    numbersList.set(j, numbersList.get(j + 1));
                    numbersList.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public void addElement() {
        Random rnd = new Random();
        numbersList.add(new Product(rnd.nextInt(48) + 3));
    }

    public Product find(Integer key) {
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i).getId().equals(key)) {
                System.out.print("Ми знайшли елемент: " + numbersList.get(i).toString());
                System.out.println(" ");
                return numbersList.get(i);
            }
        }
        return null;
    }
}
