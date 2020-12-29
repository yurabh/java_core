package learn_interface_scaner_input_output_file.first_example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile implements IWrite {

    public void writeInformation(String line) {

        FileWriter fileWriter = null;

        String filePath = "D:/yura1.txt";

        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line, 1, line.length() - 2);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("we couldn't update file because we couldn't find it");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("couldn't start buffer");
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
