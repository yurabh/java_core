package lesson_130.bruce_eckel_examples.first_example;

public class SweetShop {

    public static void main(String[] args) {
        System.out.println("print method main ");

        new Candy();

        System.out.println("after Candy");

        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("not found class Gum");
        }

        System.out.println("after class.forname(gum)");

        new Cookie();

        System.out.println("after create ob cookie");
    }
}
