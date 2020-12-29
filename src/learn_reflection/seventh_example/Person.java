package learn_reflection.seventh_example;

import java.util.Objects;

public class Person implements PersonInterface {

    private final int year = 2012;

    public int age;

    public String name = "yura";

    double price;

    private Person(int age) {
    }

    public Person() {
    }

    public Person(int age, String name, double price) throws Exception {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    public void showInformation() {
        System.out.println("Hi");
    }

    public int getYear() {
        return year;
    }

    @Deprecated
    @PersonAnnotation
    public int getAge() {
        return age;
    }

    @SuppressWarnings("uncheced")
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return year == person.year &&
                age == person.age &&
                Double.compare(person.price, price) == 0 &&
                Objects.equals(name, person.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(year, age, name, price);
    }


    @Override
    public String toString() {
        return "Person{" +
                "year=" + year +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
