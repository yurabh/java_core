package homeWork3;

public class Customer {
    private String name;
    private String surname;
    private String addressofresidence;
    private int numbermobtelefon;
    private String email;

    public Customer(String name, String surname, String addressofresidence, int numbermobtelefon, String email) {
        this.name = name;
        this.surname = surname;
        this.addressofresidence = addressofresidence;
        this.numbermobtelefon = numbermobtelefon;
        this.email = email;
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

    public String getAddressofresidence() {
        return addressofresidence;
    }

    public void setAddressofresidence(String addressofresidence) {
        this.addressofresidence = addressofresidence;
    }

    public int getNumbermobtelefon() {
        return numbermobtelefon;
    }

    public void setNumbermobtelefon(int numbermobtelefon) {
        if (numbermobtelefon < 0 || numbermobtelefon > 100000000) {
            System.out.printf("no mobilenumber");
        }
        this.numbermobtelefon = numbermobtelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void Print() {
        System.out.printf("Nmae: " + name + " surname : " + surname + "  adress : " + addressofresidence + "  Telefon : "
                + numbermobtelefon + "Email" + email);
    }
}
