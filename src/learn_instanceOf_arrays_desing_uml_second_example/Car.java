package learn_instanceOf_arrays_desing_uml_second_example;

public class Car {
    private int numberOfCar;
    private String brand;
    private String model;
    private String color;

    public Car() {
        this.numberOfCar = 123456;
        this.brand = "bmv";
        this.model = "x5";
        this.color = "bile";
    }

    public Car(int numberOfCar, String brand, String model, String color) {
        this.numberOfCar = numberOfCar;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(int numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
