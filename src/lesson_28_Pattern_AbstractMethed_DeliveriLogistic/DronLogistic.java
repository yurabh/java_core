package lesson_28_Pattern_AbstractMethed_DeliveriLogistic;

public class DronLogistic extends DeliveryLogstic {
    public Transport useTransport() {
        return new Drone();
    }
}
