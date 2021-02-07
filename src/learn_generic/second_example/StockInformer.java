package learn_generic.second_example;

public class StockInformer {

    public static void showBoxInfo(Stock<? extends Box> ob) {
        int i = 1;
        for (Box item : ob.getStaff()) {
            System.out.println("box number: " + i++);
            System.out.println("width: " + item.getWidth());
            System.out.println("height: " + item.getHeight());
            System.out.println("depth: " + item.getDepth());
        }
    }

    public static void showInfoPostbox(Stock<? extends PostBox> ob) {
        int i = 1;
        for (PostBox item : ob.getStaff()) {
            System.out.println("postBox number: " + i++);
            System.out.println("id: " + item.getId());
            System.out.println("weight:" + item.getWeight());
        }
    }

    public static void showInfoParcel(Stock<? extends Parcel> ob) {
        int i = 1;
        for (Parcel item : ob.getStaff()) {
            System.out.println("parcel number: " + i++);
            System.out.println("client: " + item.getClient());
        }
    }
}
