package learn_interface_scaner_input_output_file.first_example;

import java.util.Scanner;

public class ConsReader implements IRead {

    @Override
    public String readInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your info: ");
        return sc.nextLine();
    }
}
