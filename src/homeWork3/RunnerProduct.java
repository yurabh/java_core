package homeWork3;

import java.time.LocalDate;

public class RunnerProduct {
    public static void main(String[] args) {
        Product Moloko = new Product("molocnucja", LocalDate.of(2017, 11, 22),
                LocalDate.of(2017, 11, 29), 54);
        Moloko.Print();
    }
}
