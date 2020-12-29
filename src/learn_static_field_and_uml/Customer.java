package learn_static_field_and_uml;

public class Customer extends Person {

    private int phone;

    public Customer(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
