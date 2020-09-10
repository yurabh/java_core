package homeWorkPatterns_Information_Expert.Stock_CashRegister_Sale_ProductDesc;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Stock implements Serializable {
    private static ArrayList<ProductDesc> avaibeleproducts = new ArrayList<>();//Доступні для продажу.
    private static ArrayList<ProductDesc> incamproducts = new ArrayList<>();//Першим чином додаю у прихід.
    private static ArrayList<ProductDesc> spusaniProductu = new ArrayList<>();//Списані продукти.


    public static void addProduct(ProductDesc product) {
        if (Stock.verifyProduct(product)) {
            incamproducts.add(product);
        } else {
            System.out.println("Неможливо додати пустий обект продукту");
        }
    }


    public static void addProduct() {
        ProductDesc product = Stock.createProduct();
        if (Stock.verifyProduct(product)) {
            incamproducts.add(product);
        } else {
            System.out.println("Неможливо додати пустий обект продукту");
        }
    }


    public static ProductDesc createProduct() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть id продукту: ");
        int id = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введіть назву продукту: ");
        String description = scan1.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Введіть price продукту: ");
        int price = scan2.nextInt();
        System.out.print("Дата початку продукту: ");
        LocalDate dataManifactori = ProductDesc.DataProduct();
        System.out.print("Дата Закінчення: ");
        LocalDate dataEnd = ProductDesc.DataProduct();
        ProductDesc productDesc = new ProductDesc(id, description, price, dataManifactori, dataEnd);
        //incamproducts.add(productDesc);
        return productDesc;
    }


    public static ProductDesc FindProduct(int id) {
        ProductDesc product = null;
        for (ProductDesc i : avaibeleproducts) {
            if (i.equalsId(id)) {
                product = i;
                avaibeleproducts.remove(i);
                return product;
                //break;
            }
        }
        return product;
    }


    public static boolean findProduct(int id) {
        for (ProductDesc i : avaibeleproducts) {
            if (i.equalsId(id)) {
                return true;
            }
        }
        return false;
    }


    public static boolean verifyProduct(ProductDesc productdesc) {
        if (ProductDesc.verifyProduct(productdesc)) {
            return true;
        } else {
            return false;
        }
    }


    public static void revalueGoods() {
        System.out.print("Введіть id товару якого ви бажаете змінити ціну");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        if (avaibeleproducts.size() != 0) {
            for (int i = 0; i < avaibeleproducts.size(); i++) {
                ProductDesc productDesc = avaibeleproducts.get(i);
                if (productDesc.equalsId(id)) {
                    System.out.println("Введіть нову ціну продукту: ");
                    Scanner sc1 = new Scanner(System.in);
                    int value = sc1.nextInt();
                    productDesc.setPrice(value);
                    avaibeleproducts.remove(i);
                    avaibeleproducts.add(i, productDesc);
                }
            }
        } else {
            System.out.println("Пустий склад з продуктами де би мали продаватись товари");
        }
    }


    public static void validityProduct() {
        for (int i = 0; i < incamproducts.size() && incamproducts.size() != 0; i++) {
            {
                ProductDesc productDesc = incamproducts.get(i);
                if (ProductDesc.oravaliditem(productDesc)) {
                    avaibeleproducts.add(productDesc);
                    incamproducts.remove(i);
                } else {
                    spusaniProductu.add(productDesc);
                    incamproducts.remove(i);
                }
                i--;
            }
        }
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public static ArrayList<ProductDesc> getProduct(ProductDesc product, int q) {
        ArrayList<ProductDesc> products1 = new ArrayList<>();
        if (Stock.verifyProduct(product) && (!avaibeleproducts.isEmpty())) {
            for (ProductDesc pro : avaibeleproducts) {
                if (pro.equals(product)) {
                    products1.add(pro);
                }
            }
            if (products1.size() == q) {
                for (ProductDesc prod : products1) {
                    if (prod.equals(product)) {
                        avaibeleproducts.remove(prod);
                    }
                }
                return products1;
            }
            if (products1.size() == 0) {
                System.out.println("Не знайшлось даного продукту");
            }
            if (products1.size() != 0 && products1.size() != q) {
                System.out.println("На даний момент на складі така кількість знайдених продуктів: " + products1.size());
                System.out.println("Чи бажаете взяти таку кількість товару Зробыть свый вибыр 1 або 2  1 - так 2 - ні: ");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                if (number == 1) {
                    for (ProductDesc prod : products1) {
                        if (prod.equals(product)) {
                            avaibeleproducts.remove(prod);
                        }
                    }
                    return products1;
                } else {
                    System.out.println("Ви не забажали взяти таку кількість товару");
                }
            }

        } else {
            System.out.println("На складі немає елементів");
        }
        return products1;
    }


    public static ArrayList<ProductDesc> getProduct(String description, int q) {
        ArrayList<ProductDesc> products1 = new ArrayList<>();
        if ((!avaibeleproducts.isEmpty())) {
            for (ProductDesc i : avaibeleproducts) {
                if (i.equalsName(description)) {
                    products1.add(i);
                }
            }
            if (products1.size() == q) {
                for (ProductDesc prod : products1) {
                    if (prod.equalsName(description)) {
                        avaibeleproducts.remove(prod);
                    }
                }
                return products1;
            }
            if (products1.size() == 0) {
                System.out.println("Не знайшлось даного продукту");
            }
            if (products1.size() != 0 && products1.size() != q) {
                System.out.println("На даний момент на складі така кількість знайдених продуктів: " + products1.size());
                System.out.println("Чи бажаете взяти таку кількість товару Зробыть свый вибыр 1 або 2  1 - так 2 - ні: ");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                if (number == 1) {
                    for (ProductDesc prod : products1) {
                        if (prod.equalsName(description)) {
                            avaibeleproducts.remove(prod);
                        }
                    }
                    return products1;
                } else {
                    System.out.println("Ви не забажали взяти таку кількість товару");
                }
            }
        } else {
            System.out.println("На складі немає елементів");
        }
        return products1;
    }


    public static boolean findProduct(String name) {
        if ((!avaibeleproducts.isEmpty())) {
            for (ProductDesc i : avaibeleproducts) {
                if (i.equalsName(name)) {
                    return true;
                }
            }
            System.out.println("Не знайшли продукту");
        } else {
            System.out.println("Склад з готовими продуктами для продажу пустий");
        }
        return false;
    }


    public static boolean findProduct(ProductDesc productDesc) {
        if ((!avaibeleproducts.isEmpty()) && Stock.verifyProduct(productDesc)) {
            for (ProductDesc i : avaibeleproducts) {
                if (i.equals(productDesc)) {
                    System.out.println("Найшли продукт");
                    return true;
                }
            }
            System.out.println("Не найшлий продукт");
        } else {
            System.out.println("Склад пустий з придатними продуктами");
        }
        return false;
    }


    public static void showStock() {
        System.out.println(" ");
        if (!incamproducts.isEmpty()) {
            System.out.println("Товари загально всі разом ще не розпреділені");
            for (ProductDesc pro : incamproducts) {
                pro.showProductDesc();
            }
        }

        System.out.println(" ");
        if (!avaibeleproducts.isEmpty()) {
            System.out.println("Дійсні товари для продажу");
            for (ProductDesc pro : avaibeleproducts) {
                pro.showProductDesc();
            }
        }

        System.out.println(" ");
        if (!spusaniProductu.isEmpty()) {
            System.out.println("Товари недійсні");
            for (ProductDesc pro : spusaniProductu) {
                pro.showProductDesc();
            }
        }
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public static void savaDataAvaibelproducts(String path) throws IOException {
        FileOutputStream file = null;
        ObjectOutputStream objectStream = null;
        try {
            file = new FileOutputStream(path);
            objectStream = new ObjectOutputStream(file);
            objectStream.writeObject(avaibeleproducts);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectStream.close();
            file.close();
        }
    }


    public static void savaDataIncamproducts(String path) {
        FileOutputStream file;
        try {
            file = new FileOutputStream(path);
            ObjectOutputStream objectStream = new ObjectOutputStream(file);
            objectStream.writeObject(incamproducts);
            objectStream.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void savaDataSpusaniProductu(String path) {
        FileOutputStream file;
        ObjectOutputStream objectStream;
        try {
            file = new FileOutputStream(path);
            objectStream = new ObjectOutputStream(file);
            objectStream.writeObject(spusaniProductu);
            objectStream.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Object loadDataAvaibeleproducts(String path) {
        Object tmpObject = null;
        FileInputStream file;
        try {
            file = new FileInputStream(path);
            ObjectInputStream objectStream = new ObjectInputStream(file);
            tmpObject = objectStream.readObject();
            objectStream.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tmpObject;
    }


    public static Object loadDataIncamproducts(String path) {
        Object tmpObject = null;
        FileInputStream file;
        ObjectInputStream objectStream;
        try {
            file = new FileInputStream(path);
            objectStream = new ObjectInputStream(file);
            tmpObject = objectStream.readObject();
            objectStream.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Серіалізація");
        }
        return tmpObject;
    }


    public static Object loadDataSpusani(String path) {
        Object tmpObject = null;
        FileInputStream file = null;
        ObjectInputStream objectStream = null;
        try {
            file = new FileInputStream(path);
            objectStream = new ObjectInputStream(file);
            tmpObject = objectStream.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectStream.close();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tmpObject;
    }
}
