package homeWork4;

import java.time.LocalDate;

public class Paiment {
    private int numbercatr;
    private LocalDate paumentdate;
    private String paumentcurrency;
    private String country;

    public Paiment(int numbercatr, LocalDate paumentdate, String paumentcurrency, String country) {
        this.numbercatr = numbercatr;
        this.paumentdate = paumentdate;
        this.paumentcurrency = paumentcurrency;
        this.country = country;
    }
}
