package learn_interface_scaner_input_output_file.first_example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderFile implements IRead {

    public String readInformation() {

        String filePath = "D:/games_two.txt";
        String objectString = null;
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        ArrayList<String> string = new ArrayList<>();

        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            while ((objectString = bufferedReader.readLine()) != null) {
                string.add(objectString);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("we couldn't update file because we couldn't find it");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("couldn't start buffer");
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(string.toString());
        return string.toString();
    }
}
