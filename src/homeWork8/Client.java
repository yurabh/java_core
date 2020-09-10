package homeWork8;

public class Client extends Person {
    private int numberPhone;
    private String address;


    public Client() {
        super();
        this.numberPhone = 0636345;
        this.address = "trylovskoho";
    }

    public Client(String name, String surname, int numberPhone, String address) {
        super(name, surname);
        this.numberPhone = numberPhone;
        this.address = address;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
