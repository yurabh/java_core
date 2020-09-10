package homeWork129;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 23, 4, 500, 600, 77};

        List<Integer> filteredNumbersByStream = Arrays.stream(numbers)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(filteredNumbersByStream);

        List<Integer> changeNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                changeNumbers.add(numbers[i]);
            }

            Arrays.stream(numbers)
                    .filter(x -> x < 100)
                    .map(x -> x * 100)
                    .forEach(System.out::println);  //#1  from array

            Stream.of(1, 4, 23, 4, 500, 600, 77)
                    .filter(x -> x < 100)
                    .map(x -> x * 100)
                    .forEach(System.out::println); //#2 from values

            changeNumbers.stream(); //#3 from any type of collection

            Map<Integer, String> someMap = new HashMap<>();

            someMap.entrySet()
                    .stream(); // #3 stream for map

            Stream.empty(); //#4 empty stream


            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(12);
            arrayList.add(11);
            arrayList.add(122);
            arrayList.add(12312);
            arrayList.add(13);

            System.out.println(arrayList);
        }
    }
}
