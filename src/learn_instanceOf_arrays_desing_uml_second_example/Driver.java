package learn_instanceOf_arrays_desing_uml_second_example;

import java.time.LocalDate;

public class Driver extends Employee {

    private Car car;
    private int howItWorks;

    public Driver() {
        super();
        this.car = null;
        this.howItWorks = 12;
    }

    public Driver(String name, String surName, int id, double salary, LocalDate hireDate,
                  String phoneNumber, Car car, int howItWorks) {
        super(name, surName, id, salary, hireDate, phoneNumber);
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
        employeeShow();
        System.out.println();
        System.out.println("Вивід Сar");
        System.out.println("Номер авто: " + car.getNumberOfCar());
        System.out.println("Марка авто: " + car.getBrand());
        System.out.println("Модель авто: " + car.getModel());
        System.out.println("Колір авто: " + car.getColor());
        System.out.println("Скільки працює" + howItWorks);
    }
}
