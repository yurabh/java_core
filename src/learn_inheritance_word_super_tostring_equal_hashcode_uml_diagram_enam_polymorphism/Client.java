package learn_inheritance_word_super_tostring_equal_hashcode_uml_diagram_enam_polymorphism;

import java.util.Objects;

public class Client extends Person {

    private int numberPhone;
    private String address;

    public Client() {
        super();
        this.numberPhone = 063634;
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

    public void showInfo() {
        super.showInfo();
        System.out.println("Номер телефону: " + numberPhone);
        System.out.println("Address: " + address);
    }

    @Override
    public String toString() {
        return "Client: " + super.toString() + "  numberPhone=" + numberPhone +
                "  address='" + address + "\t";

    }

    public boolean equals(Object o) {
        // if(this == o)return true;
        Client cli = (Client) o;
        if (!super.equals(cli)) {
            return false;
        }
        if (this.numberPhone == cli.numberPhone && this.address == cli.address) {
            return true;
        }
        if (this.numberPhone != cli.numberPhone || this.address != cli.address) {
            return false;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberPhone, address);
    }
}
