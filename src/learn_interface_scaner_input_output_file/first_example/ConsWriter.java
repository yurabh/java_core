package learn_interface_scaner_input_output_file.first_example;

public class ConsWriter implements IWrite {

    @Override
    public void writeInformation(String line) {
        System.out.println("line: " + line);
    }
}
