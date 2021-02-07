package learn_inheritance_word_super_tostring_equal_hashcode_uml_diagram_enam_polymorphism;

import java.util.ArrayList;

public class Parking {
    private String addressParking;
    private ArrayList<Driver> drivers;
    private int parkingLotNumber;
    private int priceParking;

    public Parking() {
        this.addressParking = "Trulovskogo";
        this.drivers = new ArrayList<>();
        this.parkingLotNumber = 0;
        this.priceParking = 0;
    }

    public Parking(String addressParking, ArrayList<Driver> drivers, int parkingLotNumber, int priceParking) {
        this.addressParking = addressParking;
        this.drivers = new ArrayList<>(drivers);
        this.parkingLotNumber = parkingLotNumber;
        this.priceParking = priceParking;
    }

    public String getAddressParking() {
        return addressParking;
    }

    public void setAddressParking(String addressParking) {
        this.addressParking = addressParking;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public int getParkingLotNumber() {
        return parkingLotNumber;
    }

    public void setParkingLotNumber(int parkingLotNumber) {
        this.parkingLotNumber = parkingLotNumber;
    }

    public int getPriceParking() {
        return priceParking;
    }

    public void setPriceParking(int priceParking) {
        this.priceParking = priceParking;
    }

    public void showInfo() {
        System.out.println("Адреса Парковки: " + addressParking);
        System.out.println("Вивід водіїв: " + drivers);
        System.out.println("номер місця: " + priceParking);
        System.out.println("Ціна парковки: " + priceParking);
    }
}
