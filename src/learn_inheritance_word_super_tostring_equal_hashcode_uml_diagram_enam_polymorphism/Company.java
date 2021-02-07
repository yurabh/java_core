package learn_inheritance_word_super_tostring_equal_hashcode_uml_diagram_enam_polymorphism;

import java.time.LocalDate;

public class Company {

    private String nameCompany;
    private LocalDate dateOfFoundation;

    public Company() {
        nameCompany = "Taxiservice";
        dateOfFoundation = LocalDate.now();
    }

    public Company(String nameCompany, LocalDate dateOfFoundation) {
        this.nameCompany = nameCompany;
        this.dateOfFoundation = dateOfFoundation;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public LocalDate getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(LocalDate dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }

    public void changeNameCompany(String name) {
        this.nameCompany = name;
    }

    public void showInfo() {
        System.out.println("Імя компанії: " + nameCompany);
        System.out.println("Дата : " + dateOfFoundation);
    }

    @Override
    public String toString() {
        return "Company{" +
                "nameCompany='" + nameCompany + '\'' +
                ", dateOfFoundation=" + dateOfFoundation +
                '}';
    }
}
