package learn_static_field_and_uml;

public class Supplier {
    private Product[] products;
    private int countProducts;

    public Supplier(Product[] products, int countProducts) {
        this.products = products;
        this.countProducts = countProducts;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getCountProducts() {
        return countProducts;
    }

    public void setCountProducts(int countProducts) {
        this.countProducts = countProducts;
    }
}
