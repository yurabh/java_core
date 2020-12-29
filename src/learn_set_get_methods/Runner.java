package learn_set_get_methods;

import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {

        Workers seller = new Workers("Andriy", "Balay", 27,
                LocalDate.of(2012, 7, 23));

        seller.showInfo();

        int years = seller.numberOfDays();

        System.out.println("years: " + years);

        Workers cashier = new Workers("oleg", "Virastyk", 134,
                LocalDate.now());

        cashier.showInfo();

        Manager manager = new Manager("Andriy", "Tomas", 33,
                "Mobilnitelefonu");
        manager.show();

        Customer customer = new Customer("Yura", "Bahlay", "yrad.bahlaue@gmsil.com",
                "Pasixna 107/42", 636345870);

        customer.showInfo();
    }
}
