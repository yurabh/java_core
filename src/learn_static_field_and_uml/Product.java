package learn_static_field_and_uml;

import java.time.LocalDate;

public class Product {

    private String name;
    private String brand;
    private LocalDate dateOfManufacture;
    private LocalDate endDate;
    private Supplier supplier;


    public Product(String name, String brand, LocalDate dateOfManufacture, LocalDate endDate, Supplier supplier) {
        this.name = name;
        this.brand = brand;
        this.dateOfManufacture = dateOfManufacture;
        this.endDate = endDate;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
