package homeWork2;

public class Manager {
    String name;
    String surname;
    int age;
    String vidilRobotu;

    public Manager(String name, String surname, int age1, String vidilRobotu) {
        this.name = name;
        this.surname = surname;
        age = age1;
        this.vidilRobotu = vidilRobotu;
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

    public void setAge(int age1) {
        if (age < 0 || age > 65) {
            System.out.println("no age verry good");
        } else {
            age = age1;
        }
    }

    public String getVidilRobotu() {
        return vidilRobotu;
    }

    public void setVidilRobotu(String vidilRobotu) {
        this.vidilRobotu = vidilRobotu;
    }

    public void Show() {
        System.out.println("name == " + name + "  surname == " + surname + "  Age: == " + age +
                " Vidil De pracuye" + vidilRobotu);
    }
}
