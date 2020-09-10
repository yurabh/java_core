package lesson_130.bruce_eckel_examples.four_example;

public class GenericClassReference {

    public static void main(String[] args) {
        Class intClass = int.class;

        Class<Integer> generericIntegerClass = int.class;

        generericIntegerClass = Integer.class;

        intClass = double.class;


        Class<?> wildCards = int.class;

        wildCards = double.class;

        Class<? extends Number> bounded = int.class;

        bounded = double.class;

        bounded = Number.class;
    }
}
