package learn_instanceof_arrays_desing_uml_second_example;

public class Person {
    private String name;
    private String surName;


    public Person() {
        this.name = "kola";
        this.surName = "mironow";
    }

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void showInfo() {
        System.out.println("Name = " + name + " SurName = " + surName);
    }
}
