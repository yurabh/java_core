package learn_annotation_and_json;

public class Car {

    @JsonField("md")
    private String modal;

    @JsonField
    private String vendor;

    private int year;

    public Car(String modal, String vendor, int year) {
        this.modal = modal;
        this.vendor = vendor;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modal='" + modal + '\'' +
                ", vendor='" + vendor + '\'' +
                ", year=" + year +
                '}';
    }
}
