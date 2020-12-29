package homeWork39.second_example;

import java.util.ArrayList;

public class InformationRunnerSystemPost {

    public static void main(String[] args) {

        ArrayList<Box> boxing = new ArrayList<>();
        boxing.add(new Box(1, 2, 3));
        boxing.add(new Box(11, 22, 33));
        boxing.add(new Box(13, 23, 34));

        System.out.println();
        System.out.println("Вивід коробок зі складу");
        Stock<Box> boxStock = new Stock<Box>(boxing);
        StockInformer.showBoxInfo(boxStock);
        System.out.println();

        ArrayList<PostBox> postBoxes = new ArrayList<>();
        postBoxes.add(new PostBox(1, 2, 3, 1, 2));
        postBoxes.add(new PostBox(11, 22, 33, 2, 3));
        postBoxes.add(new PostBox(13, 23, 34, 3, 4));

        System.out.println();
        System.out.println("Вивід поштових коробок коробок зі складу");
        System.out.println();
        Stock<PostBox> postBoxStock = new Stock<>(postBoxes);
        StockInformer.showInfoPostbox(postBoxStock);


        System.out.println();
        System.out.println("Вивід  посилок коробок зі складу");
        System.out.println();
        ArrayList<Parcel> parcels1 = new ArrayList<>();
        parcels1.add(new Parcel(1, 2, 3, 1, 2, "Tomas"));
        parcels1.add(new Parcel(11, 22, 33, 2, 3, "Usek"));
        parcels1.add(new Parcel(13, 23, 34, 3, 4, "Loran"));
        Stock<Parcel> parcelStock = new Stock<>(parcels1);
        StockInformer.showInfoParcel(parcelStock);
    }
}
