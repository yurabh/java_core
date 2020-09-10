package lesson_26;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class lesson26_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        String filePath = "D:/yura.txt";

        String tempLine;

        ArrayList<String> words = new ArrayList<>();

        FileReader fileReader = null;

        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(filePath);

            bufferedReader = new BufferedReader(fileReader);

            while ((tempLine = bufferedReader.readLine()) != null) {
                String[] tempWords = tempLine.split(" ");
                for (int i = 0; i < tempWords.length; i++) {
                    words.add(tempWords[i]);
                }
                //System.out.println(tempLine);
            }

            for (String word : words) {
                System.out.println(word);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File " + filePath + " not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error while reading data from Niofile");
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        String[] alphabet = {"first_example", "second_example", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
                "Q", "R", "S", "T", "U", "V", "W"
                , "X", "Y", "Z"};

        String[] alphabetTwo = new String[26];

        Scanner scanner = new Scanner(System.in);

        int c;
        do {
            System.out.print("Введыть ключ: ");
            c = scanner.nextInt();
            if (c < 0 || c > 26) {
                System.out.println("Не вірно введено ключ повторіть будь - ласка введення ключа");
            } else {
                System.out.println("Ключ введенно вірно далі відбуваеться шифрування");
            }
        } while (c < 0 || c > 26);

        for (int i = c, j = 0; i < alphabetTwo.length && j < alphabetTwo.length - c; i++, j++) {
            alphabetTwo[j] = alphabetTwo[i];
        }

        for (int i = alphabetTwo.length - c, j = 0; i < alphabetTwo.length && j < c; i++, j++) {
            alphabetTwo[i] = alphabetTwo[j];
        }

        System.out.println("До шифровання");

        for (int i = 0; i < alphabetTwo.length; i++) {
            System.out.println("litera: " + alphabetTwo[i]);
        }

        System.out.println("Після шифровання");

        for (int i = 0; i < alphabetTwo.length; i++) {
            System.out.println("litera: " + alphabetTwo[i]);
        }

        System.out.println("Ключ шифровання: " + c);
    }
}
