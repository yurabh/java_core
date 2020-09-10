package homeWorkPatterns_Work_With_BusStation;

import java.util.Scanner;

public class BusStantionClient {
    private static BusStantion busStantion;

    public static void selectAbusForTheLine(String typeBys) {
        if (typeBys.equalsIgnoreCase("Etalon")) {
            busStantion = new BuyAbusEtalon();
        } else if (typeBys.equalsIgnoreCase("Mersedes")) {
            busStantion = new BuyAbusMersedes();
        } else {
            System.out.println("There isn't is bus.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeBus;

        System.out.print("Enter the name of the bus for the program: ");

        typeBus = sc.nextLine();

        selectAbusForTheLine(typeBus);
        try {
            busStantion.busOnTheLine();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Ненаймаем даного автобуса");
        }
    }
}
