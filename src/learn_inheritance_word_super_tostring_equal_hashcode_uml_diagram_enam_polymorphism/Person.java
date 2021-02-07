package learn_inheritance_word_super_tostring_equal_hashcode_uml_diagram_enam_polymorphism;

import java.util.Objects;

public class Person {

    private String name;
    private String surName;


    public Person() {
        this.name = "yura";
        this.surName = "bahlay";
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
        System.out.println("Name = " + name + " Suranme = " + surName);
    }

    @Override
    public String toString() {
        return "name='" + name + ", surName='" + surName;
    }


    public boolean equals(Object ob) {
        // if(this == ob) {return true;}
        Person per = (Person) ob;
        if (!super.equals(ob)) {
            return false;
        }
        if (this.name == per.name && this.surName == per.surName) {
            return true;
        }
        if (this.name != per.name && this.surName != per.surName) {
            return false;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}
