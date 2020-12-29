package learn_constructor_fields;

import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {

        Customer customer = new Customer("Yuriy", "Bahlay", "Antonuca 20/123",
                "kowuka", 12313123);

        customer.showInfo();

        Product milk = new Product("molocnucja", "hi hello",
                LocalDate.of(2017, 11, 22),
                LocalDate.of(2017, 11, 29),
                54);

        milk.print();
    }
}
