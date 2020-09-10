package homeWorkPatterns_Information_Expert.Stock_CashRegister_Sale_ProductDesc;
//import org.omg.PortableServer.POAPackage.ServantAlreadyActive;
//import javax.xml.soap.SAAJMetaFactory;

import java.io.IOException;

public class RunnerPattern {
    public static void main(String[] args) throws IOException {
        //ProductDesc pr1 = new ProductDesc();
       /* ProductDesc product = new ProductDesc("xlib", 12, 1, LocalDate.of(2012, 12, 12), LocalDate.of(2022, 10, 10));
        ProductDesc product1 = new ProductDesc("xlib1", 13, 2, LocalDate.of(2013, 1, 13), LocalDate.of(2023, 11, 11));
        ProductDesc product2 = new ProductDesc("xlib2", 14, 3, LocalDate.of(2014, 2, 14), LocalDate.of(2024, 12, 12));
        ProductDesc product3 = new ProductDesc("xlib3", 15, 4, LocalDate.of(2015, 3, 15), LocalDate.of(2025, 1, 13));
        ProductDesc product4 = new ProductDesc("xlib4", 16, 5, LocalDate.of(2016, 4, 16), LocalDate.of(2026, 2, 14));

        Stock.addProduct(product);
        Stock.addProduct(product);
        Stock.addProduct(product);
        Stock.addProduct(product1);
        Stock.addProduct(product2);
        Stock.addProduct(product3);
        Stock.addProduct(product4);

        ArrayList<ProductDesc> prod = new ArrayList<>();
        prod = Stock.getProduct(product1, 3);
        for (ProductDesc pro : prod) {
            pro.showProductDesc();
        }

        System.out.println("");
        System.out.println("Name");
        System.out.println("");

        ArrayList<ProductDesc> prod1 = new ArrayList<>();
        prod1 = Stock.getProduct("xlib", 2);
        for (ProductDesc pro1 : prod1) {
            pro1.showProductDesc();
        }


        System.out.println("showInfo");
        Stock.showStock();


        boolean stock = Stock.findProduct("xlib1");
        System.out.println("Resault: " + stock);

        boolean stock1 = Stock.findProduct(product4);
        System.out.println("Resault2: " + stock1);


        product1.showProductDesc();
        int price = product1.getPrice();
        System.out.println("Ціна продукту: " + price);
        System.out.println(" ");

        SalesLineItem salesLineItem = new SalesLineItem(product, 2);
        SalesLineItem salesLineItem1 = new SalesLineItem(product1, 3);
        SalesLineItem salesLineItem2 = new SalesLineItem(product2, 4);
        SalesLineItem salesLineItem3 = new SalesLineItem(product3, 5);
        SalesLineItem salesLineItem4 = new SalesLineItem(product4, 6);

        salesLineItem2.showSalesItem();
        int Subtotol = salesLineItem2.getSubTotal();
        System.out.println("Ціна товау кількіссно: " + Subtotol);
        System.out.println(" ");

        ArrayList<SalesLineItem> sale1 = new ArrayList<SalesLineItem>();
        sale1.add(salesLineItem);
        sale1.add(salesLineItem1);
        sale1.add(salesLineItem2);
        sale1.add(salesLineItem3);
        sale1.add(salesLineItem4);


        Sale sale = new Sale(LocalDate.now(), LocalDate.now(), sale1);
        sale.showSale();
        System.out.println(" ");
        double totol = sale.getTotol();
        System.out.println("Загальна вартість покупки : " + totol);


        ArrayList<SalesLineItem> sale3 = new ArrayList<SalesLineItem>();
        sale3.add(salesLineItem);
        sale3.add(salesLineItem1);
        sale3.add(salesLineItem2);
        sale3.add(salesLineItem3);
        sale3.add(salesLineItem4);
        */


        Stock.showStock();
        Stock.addProduct(Stock.createProduct());
        Stock.addProduct(Stock.createProduct());
        Stock.validityProduct();
        Sale sale4 = new Sale();
        sale4.addSaleLineItem();
        CashRegister.addCheck(sale4);
        CashRegister.showCashRegisterCheking();
        CashRegister.showCheck(sale4);
        Sale sav = CashRegister.searchCheck(sale4);
        sav.showSale();




//        //Cтворення продукту у Складі
//        Stock.addProduct(Stock.createProduct());
//        Stock.createProduct();
//
//        //Перевірка продукту на складі і розприділення по кімнатах ти пу на складах.
//        Stock.validityProduct();
//        //Вивід скаду
//        Stock.showStock();
//
//        //Пошук по ід товару і зміна ціни перед продажем тіпа.
//        Stock.revalueGoods();
//        Stock.showStock();
//
//        System.out.println(" ");
//        System.out.println("Скалад");
//        System.out.println(" ");
//
//        //Створення попупки і додавання до касово апарату.
//        CashRegister.CreatNewSale();
//
//        System.out.println(" ");
//        //Друк чеків у мому випадку один чек.
//        CashRegister.showCashRegisterCheking();
//        System.out.println(" ");
//        Stock.showStock();
//        System.out.println(" ");


//
//        Stock.savaDataAvaibelproducts("src/HomeWorkPattersInformationExpert/ProductsAvailblelnStock.txt");
//        Stock.savaDataSpusaniProductu("src/HomeWorkPattersInformationExpert/ProductsSpusaniStock.txt");
//        //Stock.savaDataIncamproducts("src/HomeWorkPattersInformationExpert/ProductsIncamproductsStock.txt");
//        ArrayList<ProductDesc> productDescs = new ArrayList<>();
//        productDescs = (ArrayList<ProductDesc>) Stock.loadDataAvaibeleproducts
//                ("src/HomeWorkPattersInformationExpert/ProductsAvailblelnStock.txt");
//
//        System.out.println("Після виводу із файлу");
//        for (ProductDesc product : productDescs) {
//            System.out.println(product.toString());
//        }
//
//        System.out.println("Після виводу із файлу");
//        ArrayList<ProductDesc> productDescs1 = new ArrayList<>();
//        productDescs1 = (ArrayList<ProductDesc>) Stock.loadDataSpusani("src/HomeWorkPattersInformationExpert/ProductsSpusaniStock.txt");
//
//        System.out.println("Після виводу із файлу");
//        for (ProductDesc product : productDescs1) {
//            System.out.println(product.toString());
//        }
//
//        ArrayList<ProductDesc> productDescs2 = new ArrayList<>();
//        productDescs2 = (ArrayList<ProductDesc>) Stock.loadDataIncamproducts("src/HomeWorkPattersInformationExpert/ProductsIncamproductsStock.txt");
//
//
//        for (ProductDesc product : productDescs2) {
//            System.out.println(product.toString());
//        }
    }
}
