package learn_instanceOf_arrays_desing_uml_second_example;

import java.time.LocalDate;

public class Company {
    private String nameCompany;
    private LocalDate dateOffFoundation;

    public Company() {
        nameCompany = "TaxiSERVICE";
        dateOffFoundation = LocalDate.now();
    }

    public Company(String nameCompany, LocalDate dateOffFoundation) {
        this.nameCompany = nameCompany;
        this.dateOffFoundation = dateOffFoundation;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public LocalDate getDateOffFoundation() {
        return dateOffFoundation;
    }

    public void setDateOffFoundation(LocalDate dateOffFoundation) {
        this.dateOffFoundation = dateOffFoundation;
    }

    public void changeNameCompany(String name) {
        this.nameCompany = name;
    }
}

