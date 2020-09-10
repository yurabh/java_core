package homeWork4;

import java.util.Scanner;

public class Person {
    private String name;
    private String surname;

    public void setName(String name) {
        this.name = name;
    }

    public void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name:");
        this.name = sc.next();
    }
}
