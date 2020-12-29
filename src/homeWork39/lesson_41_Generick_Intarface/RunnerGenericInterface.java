package homeWork39.lesson_41_Generick_Intarface;

public class RunnerGenericInterface {

    public static void main(String[] args) {

        String name = "kola";

        String surName = "voitovu4";

        System.out.println(name.compareTo(surName));

        WorkWithGeneric<Product, Integer> prList = new ProductList();
        for (int i = 0; i < 10; i++) {
            prList.addElement();
        }

        System.out.println("Out of arrayList Product");

        prList.showInfo();

        System.out.println("find Product");

        prList.remove(50);

        System.out.println("out of after remove");

        prList.showInfo();


        WorkWithGeneric<Order, Integer> orList = new OrderList();

        for (int i = 0; i < 10; i++) {
            orList.addElement();
        }

        System.out.println("out orders out of arrayList products");

        orList.showInfo();

        orList.remove(50);

        System.out.println("out of after remove");

        orList.showInfo();

        System.out.println("find Order in the arrayList orders");

        System.out.println("Element id == 45 is: " + orList.find(45));

        System.out.println("Sort Products");

        prList.bubbleSort();

        prList.showInfo();

        System.out.println("Sorted Orders");

        orList.bubbleSort();

        orList.showInfo();
    }
}