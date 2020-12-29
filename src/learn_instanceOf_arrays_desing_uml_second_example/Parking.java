package learn_instanceOf_arrays_desing_uml_second_example;

public class Parking {

    private String addressParking;
    private Driver[] drivers;
    private int parkingLotNumber;
    private int priceParking;

    public Parking() {
        this.addressParking = "Trulovskogo";
        this.drivers = null;
        this.parkingLotNumber = 0;
        this.priceParking = 0;
    }

    public Parking(String addressParking, Driver[] drivers, int parkingLotNumber, int priceParking) {
        this.addressParking = addressParking;
        this.drivers = drivers;
        this.parkingLotNumber = parkingLotNumber;
        this.priceParking = priceParking;
    }

    public String getAddressParking() {
        return addressParking;
    }

    public void setAddressParking(String addressParking) {
        this.addressParking = addressParking;
    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
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
}
