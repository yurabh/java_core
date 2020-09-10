package lesson_130.bruce_eckel_examples.interface_type_dynamic;

public class InnerImplementation {
    public static void main(String[] args) throws Exception {
        A a = InnerA.makesA();

        a.f();

        System.out.println(a.getClass().getName());
        HiddenImplementation.callHiddenMethod(a, "g");
        HiddenImplementation.callHiddenMethod(a, "u");
        HiddenImplementation.callHiddenMethod(a, "v");
        HiddenImplementation.callHiddenMethod(a, "w");
    }
}
