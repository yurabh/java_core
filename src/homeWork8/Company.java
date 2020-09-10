package homeWork8;

import java.time.LocalDate;

public class Company {
    private String NameCompany;
    private LocalDate dateOffOundation;

    public Company() {
        NameCompany = "TaxiSERVICE";
        dateOffOundation = LocalDate.now();
    }

    public Company(String nameCompany, LocalDate dateOffOundation) {
        NameCompany = nameCompany;
        this.dateOffOundation = dateOffOundation;
    }


    public String getNameCompany() {
        return NameCompany;
    }

    public void setNameCompany(String nameCompany) {
        NameCompany = nameCompany;
    }

    public LocalDate getDateOffOundation() {
        return dateOffOundation;
    }

    public void setDateOffOundation(LocalDate dateOffOundation) {
        this.dateOffOundation = dateOffOundation;
    }


    public void ChangeNameCompany(String name) {
        this.NameCompany = name;
    }
}
