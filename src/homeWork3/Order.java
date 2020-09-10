package homeWork3;

import java.time.LocalDate;

public class Order {
    private int id;
    private LocalDate date;
    private Customer custumer;
    private Product[] products;

    public Order(int id, LocalDate date, Customer custumer, Product[] products) {
        this.id = id;
        this.date = date;
        this.custumer = custumer;
        this.products = new Product[10];
    }
}
