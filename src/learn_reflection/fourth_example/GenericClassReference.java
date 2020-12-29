package learn_reflection.fourth_example;

public class GenericClassReference {

    public static void main(String[] args) {

        Class intClass = int.class;

        System.out.println("int.class: " + intClass.getName());

        Class<Integer> genericIntegerClass = int.class;

        System.out.println("generic int.class: " + genericIntegerClass.getName());

        genericIntegerClass = Integer.class;

        System.out.println("Integer.class: " + genericIntegerClass.getName());

        intClass = double.class;

        System.out.println("double.class: " + intClass);


        Class<?> wildCards = int.class;

        System.out.println("wild int.class: " + wildCards.getSimpleName());

        wildCards = double.class;

        System.out.println("wild double.class: " + wildCards.getSimpleName());

        Class<? extends Number> bounded = int.class;

        System.out.println("int.class extends from Number: " + bounded.getSimpleName());

        bounded = double.class;

        System.out.println("double.class: " + bounded.getSimpleName());

        bounded = Number.class;

        System.out.println("Number.class: " + bounded.getSimpleName());
    }
}
