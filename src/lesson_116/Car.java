package lesson_116;

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

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
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
