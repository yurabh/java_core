package lesson_130.bruce_eckel_examples.interface_type_dynamic;

public class B implements A {
    @Override
    public void f() {
        System.out.println("class second_example method F");
    }

    public void g() {
        System.out.println("class second_example method G");
    }
}
