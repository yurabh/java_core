package lesson_130.bruce_eckel_examples.interface_type_dynamic;

public class InterfaceViolation {

    public static void main(String[] args) {

        A a = new B();
        a.f();
        //a.g();
        System.out.println(a.getClass().getName());

        if (a instanceof B) {
            B b = (B) a;
            b.g();
        }
    }
}
