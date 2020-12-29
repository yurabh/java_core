package learn_static_field_and_uml;

import java.util.Scanner;

public class Person {

    private String name;
    private String surName;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setName() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        this.name = sc.next();
    }
}
