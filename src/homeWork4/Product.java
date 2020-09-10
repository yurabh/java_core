package homeWork4;

import java.time.LocalDate;

public class Product {
    private String name;
    private String marka;
    private LocalDate datemanifacture;
    private LocalDate enddate;
    private Supllier supllier;

    public Product(String name, String marka, LocalDate datemanifacture, LocalDate enddate, Supllier supllier) {
        this.name = name;
        this.marka = marka;
        this.datemanifacture = datemanifacture;
        this.enddate = enddate;
        this.supllier = supllier;
    }
}
