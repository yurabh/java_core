package learn_set.second_example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class RunnerCounterWord {

    public static void main(String[] args) {

        String filePath = "src/learn_set/second_example/games_two.txt";

        String data = getData(filePath);

        System.out.println(data);

        NavigableSet<String> ob = new TreeSet<>();

        ob.addAll(getWords(data));

        NavigableSet<String> words1;

        words1 = workWithMethodsNavigableInterface(ob);

        showSet(words1);

        String values = workWithInterfaceMethodReturnString(ob);

        System.out.println(values);

        showSet(ob);
    }


    private static int instructionForNavigableMethod() {
        Scanner sc = new Scanner(System.in);
        int value;
        do {
            System.out.println("1: wordsNew.tailSet()");
            System.out.println("2: wordsNew.subSet(C,N");
            System.out.println("3: wordsNew.subSet(C, true, G, true);");
            System.out.println("4: wordsNew.headSet(Banquet, true);");
            System.out.println("5: wordsNew.descendingSet()");
            System.out.print("Зробіть вибір: ");
            value = sc.nextInt();
            if (value < 0 || value > 6) {
                System.out.println("Введіть ще раз не вірне введення");
            }
        } while (value < 0 || value > 6);
        return value;
    }


    public static NavigableSet<String> workWithMethodsNavigableInterface(
            NavigableSet<String> words) {
        NavigableSet<String> wordsNew = new TreeSet<>();
        int value;
        System.out.println("All words those without * , ect: " + words.size());

        value = instructionForNavigableMethod();
        if (value == 1) {
            System.out.println("All words those end is letter b -> end");
            wordsNew = words.tailSet("nature", true);
        } else if (value == 2) {
            System.out.println("Вишукуем слова з одноі позиціі по сторці і до іншоі позиціі по стоках");
            wordsNew = (NavigableSet<String>) words.subSet("nature", "takes");
        } else if (value == 3) {
            System.out.println("Вишукуем слова з одноі позиціі по сторці і до іншоі позиціі по стоках включаючи ці що передаем");
            wordsNew = words.subSet("nature", true, "takes", true);
        } else if (value == 4) {
            System.out.println("Повертае < заданоі границі");
            wordsNew = words.headSet("nature", true);
        } else if (value == 5) {
            System.out.println("Вивід у зворотньому порядку)))");
            wordsNew = words.descendingSet();
        }
        return wordsNew;
    }


    private static int instructionForMethodsWhoReturnByString() {
        Scanner sc = new Scanner(System.in);
        int value;
        do {
            System.out.println("1: wordsReturned = wordsNew.higher(Banquet);");
            System.out.println("2: wordsNew.ceiling(Banquet);");
            System.out.println("3: wordsReturned = wordsNew.floor(Banquet);");
            System.out.println("4: wordsReturned = wordsNew.lower(Banquet);");
            System.out.println("5: wordsReturned = wordsNew.pollFirst();");
            System.out.println("6: wordsReturned = wordsNew.pollLast();");
            System.out.print("Make your choose: ");
            value = sc.nextInt();
            if (value < 0 || value > 8) {
                System.out.println("Enter again please: ");
            }
        } while (value < 0 || value > 8);
        return value;
    }


    public static String workWithInterfaceMethodReturnString(NavigableSet<String> words) {
        int value;
        String wordsReturned = null;
        System.out.println("All words those without * , ect: " + words.size());
        value = instructionForMethodsWhoReturnByString();
        if (value == 1) {
            System.out.println("Search element > Banquet");
            wordsReturned = words.higher("Banquet");
        } else if (value == 2) {
            System.out.println("Search element >= Banquet");
            wordsReturned = words.ceiling("Banquet");
        } else if (value == 3) {
            System.out.println("Search element <= Banquet");
            wordsReturned = words.floor("Banquet");
        } else if (value == 4) {
            System.out.println("\"Search element < Banquet");
            wordsReturned = words.lower("Banquet");
        } else if (value == 5) {
            System.out.println("PollFirst elements in this TreeSet");
            wordsReturned = words.pollFirst();
        } else if (value == 6) {
            System.out.println("PollLast elements in this TreeSet");
            wordsReturned = words.pollLast();
        }
        return wordsReturned;
    }


    public static String getData(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        StringBuilder text = new StringBuilder();
        String tempLine;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while ((tempLine = bufferedReader.readLine()) != null) {
                text.append(" ");
                text.append(tempLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + path + " not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error while reading data from ioFile");
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
        return text.toString();
    }


    public static Set<String> getWords(String text) {
        Set<String> words = new TreeSet<>();
        String[] tempWords = text.split(" ");
        for (int i = 0; i < tempWords.length; i++) {
            if (tempWords[i].length() > 2) {
                words.add(clearWord(tempWords[i]));
            }
        }
        System.out.println("All words :" + tempWords.length);
        System.out.println("Unique words :" + words.size());
        return words;
    }


    public static String clearWord(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 32 && stringBuilder.charAt(i) <= 64) {
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }
        return stringBuilder.toString();
    }


    public static void showSet(Set<String> stringSet) {
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
