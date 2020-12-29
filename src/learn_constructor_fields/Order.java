package learn_constructor_fields;

import java.time.LocalDate;

public class Order {

    private int id;
    private LocalDate date;
    private Customer customer;
    private Product[] products;

    public Order(int id, LocalDate date, Customer customer, Product[] products) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.products = new Product[10];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
