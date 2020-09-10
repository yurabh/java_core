package homeWork2;

public class Customer {
    String name;
    String surname;
    String email;
    String addressProwuvnnja;
    long numberPhone;

    public Customer(String name, String surname, String email, String addressProwuvnnja, long numberPhone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.addressProwuvnnja = addressProwuvnnja;
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

    public String getAddressProwuvnnja() {
        return addressProwuvnnja;
    }

    public void setAddressProwuvnnja(String addressProwuvnnja) {
        this.addressProwuvnnja = addressProwuvnnja;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(long numberPhone) {
        if (numberPhone < 0 || numberPhone > 100000000) {
            System.out.println("no mob telefon");
        } else {
            this.numberPhone = numberPhone;
        }
    }

    public void ShowInfo() {
        System.out.println("name == " + name + "  surname == " + surname + "  Age: == " + email + "  Local_day == " +
                " Adresa prowuvannja" + addressProwuvnnja + "  numberPhone" + numberPhone);
    }
}
