package learn_inheritance_word_super_tostring_equal_hashcode_uml_diagram_enam_polymorphism;

public class Car {

    private int numberOfSteatsTheCar;
    private String brand;
    private String model;
    private Color color1;


    public Car() {
        this.numberOfSteatsTheCar = 123456;
        this.brand = "bmv";
        this.model = "x5";
        this.color1 = Color.red;
    }

    public Car(int numberOfSteatsTheCar, String brand, String model, Color color) {
        this.numberOfSteatsTheCar = numberOfSteatsTheCar;
        this.brand = brand;
        this.model = model;
        this.color1 = color;
    }

    public int getNumberOfSteatsTheCar() {
        return numberOfSteatsTheCar;
    }

    public void setNumberOfSteatsTheCar(int numberOfSteatsTheCar) {
        this.numberOfSteatsTheCar = numberOfSteatsTheCar;
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

    public Color getColor() {
        return color1;
    }

    public void setColor(Color color) {
        this.color1 = color;
    }

    public void showCar() {
        System.out.println("Number Car == " + numberOfSteatsTheCar);
        System.out.println("brand == " + brand);
        System.out.println("Model == " + model);
        System.out.println("Color == " + color1.toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSteatsTheCar=" + numberOfSteatsTheCar +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", Color='" + color1 + '\'' +
                '}';
    }
}
