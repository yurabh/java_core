package lesson_29_Pattern_AbstractMethed_DeveloperProject;

import java.util.Scanner;

public class DevelopProjectClient {

    private static DevelopProject project;

    public static void chooseDeveloper(String devType) {
        if (devType.equalsIgnoreCase("java")) {
            project = new JavaDeveloperHire();
        } else {
            System.out.println("Wrong type of developer");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter developer type: ");

        String devType = sc.next();

        chooseDeveloper(devType);

        project.startWork();
    }
}
