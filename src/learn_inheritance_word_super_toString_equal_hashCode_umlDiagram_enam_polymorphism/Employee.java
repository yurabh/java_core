package learn_inheritance_word_super_toString_equal_hashCode_umlDiagram_enam_polymorphism;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person {

    private static int nextID = 1;
    private int id;
    private double salary;
    private LocalDate hireDate;
    private String phoneNumber;

    public Employee() {
        super();
        setId();
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

    public Employee(String name, String surname, String phoneNumber) {
        super(name, surname);
        setId();
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId() {
        this.id = nextID;
        nextID++;
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

    public void showInfo() {
        super.showInfo();
        System.out.println("id: " + id);
        System.out.println("salary" + salary);
        System.out.println("hireDate" + hireDate);
        System.out.println("phone number" + phoneNumber);
    }

    @Override
    public String toString() {
        return super.toString() + "  Employee{" + "id=" + id + ", salary=" + salary + ", hireDate="
                + hireDate + ", phoneNumber='" + phoneNumber + '\'' + '}';
    }

    public boolean equals(Object o) {
        //  if(this == o){return true;}
        Employee emp = (Employee) o;
        if (!super.equals(o)) {
            return false;
        }
        if (this.id == emp.id && this.salary == emp.salary && this.hireDate == emp.hireDate
                && this.phoneNumber == emp.phoneNumber) {
            return true;
        }
        if (this.id != emp.id || this.salary != emp.salary || this.hireDate != emp.hireDate
                || this.phoneNumber != emp.phoneNumber) {
            return false;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, salary, hireDate, phoneNumber);
    }
}
