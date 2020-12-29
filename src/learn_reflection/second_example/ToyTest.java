package learn_reflection.second_example;

public class ToyTest {

    private static void printInfo(Class aClass) {

        System.out.println("name of class: " + aClass.getName() + " interface or not: [" + aClass.isInterface() + "]");

        System.out.println("simple name: " + aClass.getSimpleName());

        System.out.println("cannonic name: " + aClass.getCanonicalName());
    }


    public static void main(String[] args) {

        Class aClass1 = null;

        try {
            aClass1 = Class.forName("learn_reflection.second_example.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find class CandyToy");
        }

        printInfo(aClass1);

        for (Class aClass : aClass1.getInterfaces()) {
            printInfo(aClass);
        }

        Class up = aClass1.getSuperclass();
        System.out.println(up);
    }
}
