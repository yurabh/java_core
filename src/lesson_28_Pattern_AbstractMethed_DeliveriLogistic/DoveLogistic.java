package lesson_28_Pattern_AbstractMethed_DeliveriLogistic;

public class DoveLogistic extends DeliveryLogstic {
    public Transport useTransport() {
        return new Dove();
    }
}
