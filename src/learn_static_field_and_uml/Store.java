package learn_static_field_and_uml;

public class Store {
    private Product[] products;
    private int countOfProducts;

    public Store(Product[] products, int countOfProducts) {
        this.products = products;
        this.countOfProducts = countOfProducts;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getCountOfProducts() {
        return countOfProducts;
    }

    public void setCountOfProducts(int countOfProducts) {
        this.countOfProducts = countOfProducts;
    }
}
