package learn_set_get_methods;

public class Customer {

    private String name;
    private String surname;
    private String email;
    private String address;
    private long numberPhone;

    public Customer(String name, String surname, String email, String address, long numberPhone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(long numberPhone) {

        if (numberPhone < 0 || numberPhone > 100000000) {
            System.out.println("no mobile phone");
        } else {
            this.numberPhone = numberPhone;
        }
    }

    public void showInfo() {
        System.out.println("name: " + name + "  surName: " + surname + "  age:" + email + "  local_date: " +
                " address: " + address + "  numberPhone: " + numberPhone);
    }
}
