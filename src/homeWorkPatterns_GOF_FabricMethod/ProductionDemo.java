package homeWorkPatterns_GOF_FabricMethod;

import java.util.Scanner;

public class ProductionDemo {
    private static Factory create;

    public static void CreateMebel(String typeMebeli) {
        if (typeMebeli.equalsIgnoreCase("Table")) {
            create = new TableFactory();
        } else if (typeMebeli.equalsIgnoreCase("chair")) {
            create = new ChairFactory();
        } else {
            System.out.println("Немає такої мебелі");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String typeFyrnityre;
        System.out.print("Введіть мебель для створення: ");
        typeFyrnityre = sc.nextLine();
        CreateMebel(typeFyrnityre);
        try {
            create.furnitureCreateFabrika();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Не можливо було стоврити таку мебель");
        }
    }
}
