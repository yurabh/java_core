package homeWork3;

import java.time.LocalDate;

public class Product {
    private String marka;
    private String title;
    private LocalDate dateofmanufacture;
    private LocalDate enddate;
    private int price;

    public Product(String name, LocalDate dateofmanufacture, LocalDate enddate, int price) {
        this.marka = name;
        this.dateofmanufacture = dateofmanufacture;
        this.enddate = enddate;
        this.price = price;
    }

    public String getName() {
        return marka;
    }

    public void setName(String name) {
        this.marka = name;
    }

    public LocalDate getDateofmanufacture() {
        return dateofmanufacture;
    }

    public void setDateofmanufacture(LocalDate dateofmanufacture) {
        this.dateofmanufacture = dateofmanufacture;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0 || price > 100) {
            System.out.println("no price");
        } else {
            this.price = price;
        }
    }

    public void Print() {
        System.out.printf("Name: " + marka + "  Dateofmanufacture: " + dateofmanufacture + " enddate: " + enddate +
                "Price: " + price);
    }
}
