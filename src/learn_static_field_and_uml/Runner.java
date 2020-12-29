package learn_static_field_and_uml;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Next id = " + Order.getNextID());

        Order or1 = new Order();

        or1.showInfo();

        System.out.println("Next id = " + Order.getNextID());

        Order or2 = new Order();

        or2.showInfo();

        System.out.println("Next id = " + Order.getNextID());
    }
}
