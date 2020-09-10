package homeWork2;

import java.time.LocalDate;

public class Workers {
    String name;
    String surname;
    int age;
    LocalDate dateofbirth;

    public Workers(String name, String surname, int age, LocalDate dateofbirth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dateofbirth = dateofbirth;
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

    public int getAge() {
        return this.age;
    }

    public void setAge(int age1) {
        if (age1 < 0 || age1 > 65) {
            System.out.println("no Age");
        } else {
            this.age = age;
        }
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }


    public void ShowInfo() {
        System.out.println("name == " + name + "  surname == " + surname + "  Age: == " + age + "  Local_day == " + dateofbirth);
    }

    //Цей метод що рахує кількість прожитих років.Це типу 2 - ге завдання.
    public int numberOf_days() {
        int Yearofbirth = dateofbirth.getYear();
        LocalDate PresentTime = LocalDate.now();
        int PresenTime1 = PresentTime.getYear();
        System.out.println("Teperiwniy Cas  == " + PresenTime1);
        int Results = PresenTime1 - Yearofbirth;
        return Results;
    }

}
