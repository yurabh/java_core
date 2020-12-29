package learn_constructor_fields;

import java.time.LocalDate;

public class Product {

    private String brand;
    private String title;
    private LocalDate dateOfManufacture;
    private LocalDate endDate;
    private int price;

    public Product(String brand, String title, LocalDate dateOfManufacture, LocalDate endDate, int price) {
        this.brand = brand;
        this.title = title;
        this.dateOfManufacture = dateOfManufacture;
        this.endDate = endDate;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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

    public void print() {
        System.out.println("name: " + brand + "  dateOfManufacture: " + dateOfManufacture + " endDate: " + endDate +
                "price: " + price);
    }
}
