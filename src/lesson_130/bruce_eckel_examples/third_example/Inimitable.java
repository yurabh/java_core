package lesson_130.bruce_eckel_examples.third_example;

public class Inimitable {
    public static final int staticFinal = 47;
    public static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Static block Initialization iniTable");
    }
}
