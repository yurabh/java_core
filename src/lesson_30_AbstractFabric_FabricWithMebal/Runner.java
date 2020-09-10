package lesson_30_AbstractFabric_FabricWithMebal;

import lesson_30_AbstractFabric_FabricWithMebal.Ierarxija_1.HighTechFactory;
import lesson_30_AbstractFabric_FabricWithMebal.Ierarxija_1.ModernFactory;
import lesson_30_AbstractFabric_FabricWithMebal.Ierarxija_1.PopArtFactory;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        FactoryClient client = null;
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Get and Use High Tech Furniture ");
        System.out.println("Get and Use Modern Furniture ");
        System.out.println("Get and Use PopArt Furniture ");
        System.out.println("- >");
        choice = sc.nextInt();
        switch (choice) {
            case 1: {
                client = new FactoryClient(new HighTechFactory());
                break;
            }
            case 2: {
                client = new FactoryClient(new ModernFactory());
                break;
            }
            case 3:
                client = new FactoryClient(new PopArtFactory());
                break;
        }
        System.out.println("Test Using Furniture\n");
        client.testChair();
        client.testSofa();
        client.testTable();
    }
}
