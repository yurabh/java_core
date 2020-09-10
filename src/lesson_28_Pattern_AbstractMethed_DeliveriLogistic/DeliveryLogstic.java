package lesson_28_Pattern_AbstractMethed_DeliveriLogistic;

public abstract class DeliveryLogstic {
    public abstract Transport useTransport();
    public void planDelivery() {
        Transport transport = useTransport();
        transport.deliverMail();
    }
}
