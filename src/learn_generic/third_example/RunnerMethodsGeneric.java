package learn_generic.third_example;

import java.util.ArrayList;
import java.util.Random;

public class RunnerMethodsGeneric {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        Random random = new Random();

        int i = 0;

        while (i < 10) {
            integers.add(random.nextInt(300));
            i++;
        }

        GenericMethods.showInfo(integers);
        GenericMethods.bubbleSort(integers);
        GenericMethods.showInfo(integers);

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(32.1);
        doubles.add(3.1);
        doubles.add(2.1);
        doubles.add(12.1);
        doubles.add(42.1);

        GenericMethods.showInfo(doubles);
        GenericMethods.bubbleSort(doubles);
        GenericMethods.showInfo(doubles);
        GenericMethods.showInfo(doubles);
    }
}
