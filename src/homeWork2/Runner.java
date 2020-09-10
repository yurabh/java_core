package homeWork2;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        Workers Prodavecj = new Workers("Andriy", "Bahlay", 27, LocalDate.of(2012, 7,
                23));
        Prodavecj.ShowInfo();
        int Years = Prodavecj.numberOf_days();
        System.out.printf("Results == " + Years);
        Workers Kasur = new Workers("oleg", "Virastyk", 134, LocalDate.now());
        Kasur.ShowInfo();
    }
}
