package lesson_133.access_modifiers.second_example;

import lesson_133.access_modifiers.first_example.TestB;

import java.util.ArrayList;

public class TestA extends lesson_133.access_modifiers.first_example.TestA {

    public void pubTestA() {
        super.defaultTestA();
    }

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        lesson_133.access_modifiers.first_example.TestA testA = new lesson_133.access_modifiers.first_example.TestA();

        TestB testB = new TestB();
    }
}
