package learn_access_modifiers.second_example;

import learn_access_modifiers.first_example.TestB;

import java.util.ArrayList;

public class TestA extends learn_access_modifiers.first_example.TestA {

    public void pubTestA() {
        super.defaultTestA();
    }

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        learn_access_modifiers.first_example.TestA testA =
                new learn_access_modifiers.first_example.TestA();

        TestB testB = new TestB();
    }
}
