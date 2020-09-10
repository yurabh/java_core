package homeWorkPatterns_Information_Expert.Stock_CashRegister_Sale_ProductDesc;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class ProductDesc implements Serializable {

    private static final long serialVersionUID = 54L;
    private String description;
    private int price;
    private int ItemId;
    private LocalDate dateOfManifactory;
    private LocalDate dataOfEndDate;


    public ProductDesc(int itemId, String description, int price, LocalDate dateOfmanufacture, LocalDate dataOfEndDate) {
        this.ItemId = itemId;
        this.description = description;
        this.price = price;
        this.dateOfManifactory = dateOfmanufacture;
        this.dataOfEndDate = dataOfEndDate;
    }

    public ProductDesc(String description, int price, int itemId, LocalDate dateOfManifactory, LocalDate dataOfEndDate) {
        this.description = description;
        this.price = price;
        ItemId = itemId;
        this.dateOfManifactory = dateOfManifactory;
        this.dataOfEndDate = dataOfEndDate;
    }

    public ProductDesc() {
        this.description = null;
        this.price = 0;
        this.ItemId = 0;
        this.dateOfManifactory = LocalDate.of(2018, 02, 29);
        this.dataOfEndDate = LocalDate.of(2018, 03, 13);
    }


    public ProductDesc(int itemId, String description, int price) {
        this.ItemId = itemId;
        this.description = description;
        this.price = price;
    }


    public static LocalDate DataProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть рік: ");
        int year = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введіть місяць: ");
        int mouth = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введіть день: ");
        int day = sc2.nextInt();
        LocalDate datamanufecture;
        datamanufecture = LocalDate.of(year, mouth, day);
        return datamanufecture;
    }


    //Назар дивись у цьому методі я не міг зробити порівняня з локал дейтемми.
    public static boolean oravaliditem(ProductDesc productDesc) {
        LocalDate localDate = productDesc.getDateOfManifactory();
        if (productDesc.dataOfEndDate.getYear() > localDate.getYear()) {
            return true;
        }
        return false;
    }


    public boolean equalsName(String name) {
        if (description.equals(name)) {
            return true;
        }
        return false;
    }


    public boolean equalsId(int id) {
        if (ItemId == id) {
            return true;
        }
        return false;
    }


    public static boolean verifyProduct(ProductDesc productDesc) {
        if (productDesc.description != null && productDesc.ItemId != 0 && productDesc.price != 0) {
            return true;
        } else {
            return false;
        }
    }


    public LocalDate getDateOfManifactory() {
        return dateOfManifactory;
    }

    public LocalDate getDataOfEndDate() {
        return dataOfEndDate;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int itemId) {
        ItemId = itemId;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    //Цей метод закоментований залишив у разі потреби.
    /*public ProductDesc creatNewProductDesc()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть id продукту: ");
        int id = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введіть назву продукту: ");
        String description = scan.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введіть назву продукту: ");
        int price = scan.nextInt();
        ProductDesc productDesc = new ProductDesc(id,description,price);
        return productDesc;
    }
    */

    @Override
    public boolean equals(Object o) {
        //if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDesc that = (ProductDesc) o;
        return Objects.equals(description, that.description);
    }


    @Override
    public int hashCode() {
        return Objects.hash(description, price, ItemId);
    }


    @Override
    public String toString() {
        return "ProductDesc{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", ItemId=" + ItemId +
                ", dateOfManifactory=" + dateOfManifactory +
                ", dataOfEndDate=" + dataOfEndDate +
                '}';
    }

    public void showProductDesc() {
        System.out.println(" ");
        System.out.println("Продукт");
        System.out.println(" ");
        System.out.println("description: " + description);
        System.out.println("price: " + price);
        System.out.println("ItemId: " + ItemId);
        System.out.println("DataManifactory: " + dateOfManifactory);
        System.out.println("DataEnd: " + dataOfEndDate);
        System.out.println(" ");
    }
}
