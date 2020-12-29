package learn_concurrency.parallel;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WhaleDataCalculator {

    public int processRecord(int input) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return input + 1;
    }

    public void processAllData(List<Integer> data) {
        data.parallelStream().map(a -> processRecord(a)).count();
    }

    public static void main(String[] args) {

        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();

        Stream<Integer> parallelStream = stream.parallel();

        final Stream<Integer> stream1 = Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream();


        Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .forEach(s -> System.out.print(s + " " + '\n'));

        Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .forEach(s -> System.out.print(s + " " + '\n'));

        Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .forEachOrdered(s -> System.out.print(s + " " + '\n'));

        WhaleDataCalculator calculator = new WhaleDataCalculator();

        List<Integer> data = new ArrayList<Integer>();

        for (int i = 0; i < 4000; i++)
            data.add(i);

        long start = System.currentTimeMillis();

        calculator.processAllData(data);

        double time = (System.currentTimeMillis() - start) / 1000.0;

        System.out.println("\nTasks completed in: " + time + " seconds");


        Arrays.asList("jackal", "kangaroo", "lemur")
                .parallelStream()
                .map(s -> s.toUpperCase())
                .forEach((s) -> System.out.println(s));

        Arrays.asList("jackal", "kangaroo", "lemur")
                .parallelStream().
                map(s -> {
                    System.out.println(s);
                    return s.toUpperCase();
                })
                .forEach(System.out::println);


        List<Integer> dataTwo = Collections.synchronizedList(new ArrayList<>());

        Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .map(i -> {
                    dataTwo.add(i);
                    return i;
                })
                .forEachOrdered(i -> System.out.print(i + " "));

        System.out.println(dataTwo);

        System.out.print(Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .findAny()
                .get());

        System.out.println();
        System.out.print(Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .findAny()
                .get());

        Arrays.asList(1, 2, 3, 4, 5, 6).stream().unordered();


        Arrays.asList(1, 2, 3, 4, 5, 6).stream().unordered().parallel();


        System.out.println(Arrays.asList('w', 'o', 'l', 'f')
                .stream()
                .reduce("", (c, s1) -> c + s1, (s2, s3) -> s2 + s3));


        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .reduce(0, (a, b) -> (a - b)));

        System.out.println(Arrays.asList("w", "o", "l", "f")
                .parallelStream()
                .reduce("K", String::concat));


        Stream<String> streamOne = Stream.of("w", "o", "l", "f").parallel();

        SortedSet<String> set = streamOne.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);

        System.out.println(set);


        Stream<String> streamTwo = Stream.of("w", "o", "l", "f").parallel();

        Set<String> setTwo = streamTwo.collect(Collectors.toSet());

        System.out.println(setTwo);


        Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();


        ConcurrentMap<Integer, String> map = ohMy.collect(Collectors.toConcurrentMap
                (String::length, k -> k, (s1, s2) -> s1 + "," + s2));

        System.out.println(map);

        System.out.println(map.getClass());


        Stream<String> ohMyTwo = Stream.of("lions", "tigers", "bears").parallel();

        ConcurrentMap<Integer, List<String>> mapTwo = ohMyTwo.collect(Collectors.groupingByConcurrent(String::length));

        System.out.println(mapTwo);
    }
}
