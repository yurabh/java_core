package learn_generic.second_example;

import java.util.ArrayList;

public class Stock<T extends Box> {

    private ArrayList<T> staff;

    public Stock(ArrayList<T> parcels) {
        this.staff = parcels;
    }

    public ArrayList<T> getStaff() {
        return staff;
    }
}
