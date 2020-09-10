package homeWorkPatterns_Information_Expert.Stock_CashRegister_Sale_ProductDesc;

import java.util.Objects;

public class SalesLineItem {

    private ProductDesc item;
    private int quantity;

    public SalesLineItem() {
        this.item = null;
        this.quantity = 0;
    }

    public SalesLineItem(ProductDesc item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public static SalesLineItem addSalesItem(ProductDesc product) {
        SalesLineItem ob = new SalesLineItem();
        ob.item = product;
        ob.quantity = 1;
        return ob;
    }

    public int getSubTotal() {
        int totolPrice = item.getPrice() * quantity;
        return totolPrice;
    }

    public void showSalesItem() {
        System.out.println("SalesLineItem:");
        item.showProductDesc();
        System.out.println("quantity: " + quantity);
        System.out.println(" ");
    }

    public ProductDesc getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItem(ProductDesc item) {
        this.item = item;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesLineItem that = (SalesLineItem) o;
        return quantity == that.quantity &&
                Objects.equals(item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, quantity);
    }

    @Override
    public String toString() {
        return "SalesLineItem{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}
