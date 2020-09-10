package lesson_28_1_Pattern_AbstractMethed_Product;

import java.util.Scanner;

public class RunnerProduct {
    private static Creater creater;

    public static void UseProducts(String type) {
        if (type.equalsIgnoreCase("ProductA")) {
            creater = new ConcreateCreateA();
        } else if (type.equalsIgnoreCase("ProductB")) {
            creater = new ConcreateCreateB();
        } else {
            System.out.println("Не створюєм продукути");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть назву продукту");
        String product = sc.nextLine();
        UseProducts(product);
        creater.RealisationProduct();
    }
}
