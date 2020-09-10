package homeWorkPatterns_Information_Expert.Stock_CashRegister_Sale_ProductDesc;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;



public class Sale {
    private LocalDate data;
    private LocalDate time;
    private ArrayList<SalesLineItem> salesItem;

    public Sale(LocalDate data, LocalDate time, ArrayList<SalesLineItem> salesItem) {
        this.data = data;
        this.time = time;
        this.salesItem = salesItem;
    }

    public Sale() {
        this.data = LocalDate.now();
        this.time = LocalDate.now();
        this.salesItem = new ArrayList<>();
    }


    public void addSaleLineItem() {
        data = LocalDate.now();
        time = LocalDate.now();
        System.out.print("Введіть скільки ви продуктів бажаете знайти: ");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        //ArrayList<SalesLineItem> salesLineItems = new ArrayList<SalesLineItem>();
        for (int i = 0; i < count; i++) {
            System.out.print("Знайдіть товар по id який ви бажаете додати у покупку: ");
            Scanner scan1 = new Scanner(System.in);
            int id = scan1.nextInt();
            if (!Stock.findProduct(id)) {
                System.out.println("Не найшлось такого товару з таким айді");
                System.out.println(" ");
            } else {
                salesItem.add(SalesLineItem.addSalesItem(Stock.FindProduct(id)));
                //salesLineItems.add(SalesLineItem.addSalesItem(Stock.FindProduct(id)));
            }
        }
        //salesItem.addAll(salesLineItems);
    }


    public boolean verifyItems() {
        for (SalesLineItem i : salesItem) {
            if (Stock.verifyProduct(i.getItem())) {
                return true;
            }
        }
        return false;
    }


    public double getTotol() {
        double sumaTotol = 0;
        for (SalesLineItem i : salesItem) {
            sumaTotol += i.getSubTotal();
        }
        return sumaTotol;
    }


    public void showSale() {
        System.out.println(" ");
        System.out.println("Sale");
        System.out.println("data: " + data);
        System.out.println("time: " + time);
        for (SalesLineItem i : salesItem) {
            i.showSalesItem();
        }
        System.out.println(" ");
    }


    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public void setSalesItem(ArrayList<SalesLineItem> salesItem) {
        this.salesItem = salesItem;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Objects.equals(data, sale.data) &&
                Objects.equals(time, sale.time) &&
                Objects.equals(salesItem, sale.salesItem);
    }


    @Override
    public int hashCode() {
        return Objects.hash(data, time, salesItem);
    }


    @Override
    public String toString() {
        return "Sale{" +
                "data=" + data +
                ", time=" + time +
                ", salesItem=" + salesItem +
                '}';
    }
}