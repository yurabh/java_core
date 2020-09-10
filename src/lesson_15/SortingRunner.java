package lesson_15;

import java.util.Random;

public class SortingRunner {
    public static void main(String[] args) {

        int numbers[] = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20000);
        }

        Timer ob = new Timer();
        ob.startTime();
        Sorting.bubbleSort(numbers);
        ob.finishTime();
        System.out.println("Results: " + ob.resultsTime());
        System.out.println("sadsdas" + ob.resultsTime());
        System.out.println("sadasdas" + ob.resultsTime());
        System.out.println("sadasdas" + ob.resultsTime());
        Sorting.showArray(numbers);

        Timer ob1 = new Timer();
        ob1.startTime();
        Sorting.quickSort(numbers, 0, numbers.length - 1);
        Sorting.quickSort(numbers, 0, 50);
        Sorting.quickSort(numbers, 0, 50);
        Sorting.quickSort(numbers, 0, 50);
        Sorting.quickSort(numbers, 0, 50);
        Sorting.quickSort(numbers, 0, 50);
        Sorting.quickSort(numbers, 0, 50);
        Sorting.quickSort(numbers, 0, 50);
        Sorting.quickSort(numbers, 0, 50);
        Sorting.quickSort(numbers, 0, 50);
        Sorting.quickSort(numbers, 0, 50);
        Sorting.quickSort(numbers, 0, 50);
        Sorting.showArrayQuicksorting(numbers, 0, 30);
        ob1.finishTime();
        long results = ob1.resultsTime();
        System.out.println("Results: " + results);


        System.out.println("sadasdas" + ob1.resultsTime());
        System.out.println("sadasdas" + ob1.resultsTime());
        System.out.println("sadasdas" + ob1.resultsTime());


        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " ");
            } else {
                continue;
            }
            counter++;
        }
        System.out.println("Counter :" + counter);
    }
}
