package lesson_130.bruce_eckel_examples.second_example;

public class ToyTest {


    static void printInfo(Class cl) {

        System.out.println("Name Of Class: " + cl.getName() +
                " interface or not: [" + cl.isInterface() + "]");

        System.out.println("Simple Name: " + cl.getSimpleName());

        System.out.println("Cannonic name: " + cl.getCanonicalName());
    }


    public static void main(String[] args) {
        Class c = null;

        System.out.println("Yura bh");

        try {
            c = Class.forName("lesson_130.bruce_eckel_examples.second_example.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find Class CandyToy");
        }

        printInfo(c);

        for (Class clas : c.getInterfaces()) {
            printInfo(clas);
        }

        Class up = c.getSuperclass();
        System.out.println(up);

        Object ob = null;

        try {
            ob = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("Cannot create object");
        }

        printInfo(ob.getClass());
    }
}
