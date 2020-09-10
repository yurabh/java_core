package lesson_130.bruce_eckel_examples.reflaction;

import java.lang.reflect.*;

public class TestReflection {
    final int year = 2012;

    int age;

    String name;

    double price;

    public TestReflection(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    public TestReflection() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) throws NoSuchFieldException {

        Class<?> testReflection = TestReflection.class;

        Constructor<?>[] constructors = testReflection.getConstructors();

        TestReflection testReflection1 = new TestReflection();

        Class<? extends TestReflection> aClass = testReflection1.getClass();
    }
}
