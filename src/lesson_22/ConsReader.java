package lesson_22;

import java.util.Scanner;

public class ConsReader implements IRead {
    @Override
    public String readInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enetr your info:");
        return sc.nextLine();
    }
}
