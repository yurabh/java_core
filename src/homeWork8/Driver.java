package homeWork8;

import java.time.LocalDate;

public class Driver extends Employee {
    private Car car;
    private int howItWorks;

    public Driver() {
        super();
        this.car = null;
        this.howItWorks = 12;
    }

    public Driver(String name, String surname, int id, double salary, LocalDate hireDate,
                  String phoneNumber, Car car, int howItWorks) {
        super(name, surname, id, salary, hireDate, phoneNumber);
        this.car = car;
        this.howItWorks = howItWorks;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setHowItWorks(int howItWorks) {
        this.howItWorks = howItWorks;
    }

    public Car getCar() {
        return car;
    }

    public int getHowItWorks() {
        return howItWorks;
    }

    public void getHours() {
        System.out.println("Driver works : " + howItWorks);
    }


    public void driverShow() {
        System.out.println();
        EmployyeShow();
        System.out.println();
        System.out.println("Вивід Сar");
        System.out.println("Номер авто: " + car.getNumberOfSteatsthecar());
        System.out.println("Марка авто: " + car.getMarka());
        System.out.println("Модель авто: " + car.getModel());
        System.out.println("Колір авто: " + car.getColor());
        System.out.println("Скільки працює" + howItWorks);
    }
}
