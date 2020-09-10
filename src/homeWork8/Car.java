package homeWork8;

public class Car {

    private int numberOfSteatsthecar;
    private String Marka;
    private String Model;
    private String Color;


    public Car() {
        this.numberOfSteatsthecar = 123456;
        this.Marka = "bmv";
        this.Model = "x5";
        this.Color = "bile";
    }

    public Car(int numberOfSteatsthecar, String marka, String model, String color) {
        this.numberOfSteatsthecar = numberOfSteatsthecar;
        this.Marka = marka;
        this.Model = model;
        this.Color = color;
    }

    public int getNumberOfSteatsthecar() {
        return numberOfSteatsthecar;
    }

    public void setNumberOfSteatsthecar(int numberOfSteatsthecar) {
        this.numberOfSteatsthecar = numberOfSteatsthecar;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
