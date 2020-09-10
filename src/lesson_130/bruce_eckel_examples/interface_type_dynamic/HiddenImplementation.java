package lesson_130.bruce_eckel_examples.interface_type_dynamic;

import java.lang.reflect.Method;

public class HiddenImplementation {

    public static void callHiddenMethod(Object ob, String methodName) throws Exception {
        Method g = ob.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(ob);
    }

    public static void main(String[] args) throws Exception {
        A a = HiddenC.makes();
        a.f();

        System.out.println(a.getClass().getName());

//        if (a instanceof C) {
//            C c = (C) a;
//            c.f();
//            c.g();
//
//        }

        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }
}
