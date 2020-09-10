package homeWork40;

public class StockInformer {

    public static void showBoxInfo(Stock<? extends Box> ob) {
        int i = 1;
        for (Box item : ob.getStaff()) {
            System.out.println("Box number: " + i++);
            System.out.println("Width: " + item.getWidth());
            System.out.println("Height: " + item.getHeight());
            System.out.println("Depht: " + item.getDepht());
        }
    }

    public static void showInfoPostbox(Stock<? extends PostBox> ob) {
        //StockInformer.showBoxInfo(ob);
        int i = 1;
        for (PostBox item : ob.getStaff()) {
            System.out.println("PostBox number: " + i++);
            System.out.println("Id: " + item.getId());
            System.out.println("Weight:" + item.getWeight());
        }
    }

    public static void showInfoParcel(Stock<? extends Parcel> ob) {
        //StockInformer.showInfoPostbox(ob);
        int i = 1;
        for (Parcel item : ob.getStaff()) {
            System.out.println("Parcell number: " + i++);
            System.out.println("Client" + item.getClient());
        }
    }
}
