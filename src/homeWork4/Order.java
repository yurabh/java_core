package homeWork4;

public class Order {
    private static int nextID = 1;
    private int id;
    private Product[] products;
    private Customer customer;
    private int totolcountproducts;
    private Paiment paiment;

    public Order() {
        setId();
    }

    public Order(Product[] products, Customer customer, int totolcountproducts, Paiment paiment) {
        setId();
        this.products = products;
        this.customer = customer;
        this.totolcountproducts = totolcountproducts;
        this.paiment = paiment;
    }

    private void setId() {
        this.id = nextID;
        nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public void showInfo() {
        System.out.println("Order id = " + id);
    }
}
