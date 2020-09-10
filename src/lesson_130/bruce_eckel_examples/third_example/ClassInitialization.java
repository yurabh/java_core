package lesson_130.bruce_eckel_examples.third_example;

import java.util.Random;

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) {

        Class initable = Inimitable.class;

        System.out.println("initable staticFinal: " + Inimitable.staticFinal);

        System.out.println("initable staticfinal2: " + Inimitable.staticFinal2);

        System.out.println(":initable2 staticnonfinal: " + Inimitable2.staticNonFinal);

        try {
            Class initable3 = Class.forName("lesson_130.bruce_eckel_examples.third_example.Inimitable3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("initable3 staticnonfinal: " + Inimitable3.staticNonFinal);
    }
}
