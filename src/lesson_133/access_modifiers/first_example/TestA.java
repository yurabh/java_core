package lesson_133.access_modifiers.first_example;

public class TestA {

    int testA = 10;

    public TestA() {

    }

    public TestA(int testA) {
        this.testA = testA;
    }

    protected void defaultTestA() {
        System.out.println("TestA");
    }

    void pubTestA() {
        System.out.println("publicTestA");

    }

    public static void main(String[] args) {
        TestB testB = new TestB();
//        testB.b = 10;

        testB.defaultTestB();

        testB.pubTestB();
    }
}
