package lesson_22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile implements IWrite {
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
            System.out.println("Не можливо оновити дані у файлі через те що незнайдено файл");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Не вийде запустити буфер");
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
