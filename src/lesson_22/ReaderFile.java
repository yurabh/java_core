package lesson_22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReaderFile implements IRead {
    public String readInformation() throws IOException {
        String filePath = "D:/yura.txt";
        String objectString = null;
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        ArrayList<String> stricka = new ArrayList<String>();
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            while ((objectString = bufferedReader.readLine()) != null) {
                stricka.add(objectString);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Не вдалося знайти файл або відкрити потік");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Помилка якщо не вдалося зчитати із файлу");
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //String ob2 = bufferedReader.lines().toString();
        //System.out.println(ob2);
        System.out.println(stricka.toString());
        return stricka.toString();
    }
}
