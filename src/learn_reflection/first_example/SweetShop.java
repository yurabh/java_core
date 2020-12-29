package learn_reflection.first_example;

public class SweetShop {

    public static void main(String[] args) {

        new Candy();

        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("not found class Gum");
        }

        new Cookie();
    }
}
