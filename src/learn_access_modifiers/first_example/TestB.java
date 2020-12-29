package learn_access_modifiers.first_example;

public class TestB {

    private int b = 10;

    void defaultTestB() {
        System.out.println("TestA");
    }

    void pubTestB() {
        System.out.println("publicTestA");
    }

    public static void main(String[] args) {

        TestA testA = new TestA();

        testA.testA = 13;

        testA.defaultTestA();

        testA.pubTestA();
    }
}
