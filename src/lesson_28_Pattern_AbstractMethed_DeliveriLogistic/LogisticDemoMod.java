package lesson_28_Pattern_AbstractMethed_DeliveriLogistic;

import java.util.Scanner;

public class LogisticDemoMod {
    private static DeliveryLogstic deliveryLogstic;

    public static void sepUpTransport(String type) {
        if (type.equalsIgnoreCase("dove")) {
            deliveryLogstic = new DoveLogistic();
        } else if (type.equalsIgnoreCase("Drone")) {
            deliveryLogstic = new DronLogistic();
        } else {
            System.out.println("Не мае посилання");
        }
    }

    public static void runBussinesLogic() {
        deliveryLogstic.planDelivery();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть чим ви бажаете доставляти дронами чи птахати");
        String deliveryType = sc.next();
        sepUpTransport(deliveryType);
        runBussinesLogic();
    }
}
