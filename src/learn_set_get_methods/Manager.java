package learn_set_get_methods;

public class Manager {

    private String name;
    private String surname;
    private int age;
    private String departmentOfWork;

    public Manager(String name, String surname, int age, String departmentOfWork) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.departmentOfWork = departmentOfWork;
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
        return age;
    }

    public String getDepartmentOfWork() {
        return departmentOfWork;
    }

    public void setDepartmentOfWork(String departmentOfWork) {
        this.departmentOfWork = departmentOfWork;
    }

    public void setAge(int age1) {

        if (age < 0 || age > 65) {
            System.out.println("no age");
        } else {
            age = age1;
        }
    }

    public void show() {
        System.out.println("name: " + name + "  surname: " + surname + "  age: " + age +
                " departmentOfWork" + departmentOfWork);
    }
}
