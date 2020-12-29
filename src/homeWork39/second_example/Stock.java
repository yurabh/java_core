package homeWork39.second_example;

import java.util.ArrayList;

public class Stock<T extends Box> {

    private ArrayList<T> staff = new ArrayList<>();

    public Stock(ArrayList<T> parcels) {
        this.staff = parcels;
    }

    public ArrayList<T> getStaff() {
        return staff;
    }
}
