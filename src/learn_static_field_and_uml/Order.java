package learn_static_field_and_uml;

public class Order {

    private static int nextID = 1;
    private int id;
    private Product[] products;
    private Customer customer;
    private int totalCountOfProducts;
    private Payment payment;

    public Order() {
        setId();
    }


    public Order(Product[] products, Customer customer, int totalCountOfProducts, Payment payment) {
        setId();
        this.products = products;
        this.customer = customer;
        this.totalCountOfProducts = totalCountOfProducts;
        this.payment = payment;
    }

    public static int getNextID() {
        return nextID;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextID++;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTotalCountOfProducts() {
        return totalCountOfProducts;
    }

    public void setTotalCountOfProducts(int totalCountOfProducts) {
        this.totalCountOfProducts = totalCountOfProducts;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void showInfo() {
        System.out.println("Order id = " + id);
    }
}
