package learn_inheritance_word_super_toString_equal_hashCode_umlDiagram_enam_polymorphism;

import java.time.LocalDate;
import java.util.Objects;

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

    public void showInfo() {
        super.showInfo();
        System.out.println("");
        car.showCar();
        System.out.println("Вивід авто == " + howItWorks);
    }

    @Override
    public String toString() {
        return super.toString() + "  Driver{" + "car=" + car.toString() + ",  howItWorks=" + howItWorks + '}';
    }

    public boolean equals(Object o) {
        // if(this == o)return true;
        Driver ob = (Driver) o;
        if (!super.equals(o)) {
            return false;
        }
        if (this.howItWorks == ob.howItWorks && this.car == ob.car) {
            return true;
        }
        if (this.howItWorks != ob.howItWorks || this.car != ob.car) {
            return false;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), car, howItWorks);
    }
}
