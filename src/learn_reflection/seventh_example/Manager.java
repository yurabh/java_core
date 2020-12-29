package learn_reflection.seventh_example;

public class Manager extends Person {

    public int salary;

    String describe;

    private int count;

    public Manager(int salary, String describe, int count) {
        this.salary = salary;
        this.describe = describe;
        this.count = count;
    }

    public Manager(int age, String name, double price, int salary, String describe, int count) throws Exception {
        super(age, name, price);
        this.salary = salary;
        this.describe = describe;
        this.count = count;
    }

    @Override
    public void showInformation() {
        System.out.println("Manager");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "salary=" + salary +
                ", describe='" + describe + '\'' +
                ", count=" + count +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
