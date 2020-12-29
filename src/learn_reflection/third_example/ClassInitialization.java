package learn_reflection.third_example;

import java.util.Random;

public class ClassInitialization {

    public static Random rand = new Random(47);

    public static void main(String[] args) {

        System.out.println("inimitable staticFinal: " + Inimitable.staticFinal);

        System.out.println("inimitable staticFinal2: " + Inimitable.staticFinal2);

        System.out.println(":inimitable2 staticNonFinal: " + Inimitable2.staticNonFinal);

        System.out.println("inimitable3 staticNonFinal: " + Inimitable3.staticNonFinal);
    }
}
