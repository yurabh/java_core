package learn_reflection.fourth_example;

import java.util.ArrayList;
import java.util.List;

public class FilledList<T> {

    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int element) {
        List<T> result = new ArrayList<>();

        try {
            for (int i = 0; i < element; i++) {
                result.add(type.newInstance());
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {

        FilledList<CountedInteger> f1 = new FilledList<>(CountedInteger.class);

        List<CountedInteger> countedIntegers = f1.create(7);

        System.out.println(countedIntegers.toString());
    }
}
