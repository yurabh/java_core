package learn_instanceOf_arrays_desing_uml_second_example;

import java.time.LocalDate;

public class Employee extends Person {
    private int id;
    private double salary;
    private LocalDate hireDate;
    private String phoneNumber;

    public Employee() {
        super();
        this.id = 0;
        this.salary = 12;
        this.hireDate = LocalDate.now();
        this.phoneNumber = "0636345831";
    }


    public Employee(String name, String surname, int id, double salary, LocalDate hireDate, String phoneNumber) {
        super(name, surname);
        this.id = id;
        this.salary = salary;
        this.hireDate = hireDate;
        this.phoneNumber = phoneNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void increaseSalary(int percent) {
        double tmpSalary = getSalary() + getSalary() * percent;
        setSalary(tmpSalary);
    }

    public void employeeShow() {
        System.out.println("Name: " + getName());
        System.out.println("Surname : " + getSurName());
        System.out.println("id: " + id);
        System.out.println("salary" + salary);
        System.out.println("hireDate" + hireDate);
        System.out.println("phone number" + phoneNumber);
    }
}
