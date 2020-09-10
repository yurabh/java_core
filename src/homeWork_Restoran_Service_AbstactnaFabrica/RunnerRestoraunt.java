package homeWork_Restoran_Service_AbstactnaFabrica;

import homeWork_Restoran_Service_AbstactnaFabrica.Ierarxija1.ItalianKitchen;
import homeWork_Restoran_Service_AbstactnaFabrica.Ierarxija1.PolishKitchen;
import homeWork_Restoran_Service_AbstactnaFabrica.Ierarxija1.UkrainianKitchen;

import java.util.Scanner;

public class RunnerRestoraunt {
    public static void main(String[] args) {
        RestorauntClient client = null;
        System.out.println("1 - Ukranian Kitchen");
        System.out.println("2 - Polish Kitchen");
        System.out.println("1 - Italian Kitchen");
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Enter please with kitchen you work");
        choice = sc.nextInt();

        switch (choice) {
            case 1: {
                client = new RestorauntClient(new UkrainianKitchen());
                break;
            }
            case 2: {
                client = new RestorauntClient(new PolishKitchen());
                break;
            }

            case 3: {
                client = new RestorauntClient(new ItalianKitchen());
            }
        }
        System.out.println("Провірити блюдо");
        client.checkingDumplings();
        client.checkingMacaroni();
        client.checkingSoup();
    }
}
