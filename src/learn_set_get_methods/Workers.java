package learn_set_get_methods;

import java.time.LocalDate;

public class Workers {

    private String name;
    private String surName;
    private int age;
    private LocalDate dateOfBirth;

    public Workers(String name, String surName, int age, LocalDate dateOfBirth) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return this.age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAge(int age) {
        if (age < 0 || age > 65) {
            System.out.println("no age");
        } else {
            this.age = age;
        }
    }

    public void showInfo() {
        System.out.println("name: " + name + "  surName: " + surName + "  age:" + age +
                "  local_date: " + dateOfBirth);
    }

    public int numberOfDays() {
        int yearOfBirth = dateOfBirth.getYear();

        LocalDate timeNow = LocalDate.now();

        int yearNow = timeNow.getYear();

        System.out.println("yearNow: " + yearNow);

        int result = yearNow - yearOfBirth;

        return result;
    }
}
