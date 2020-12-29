package learn_reflection.sixth_example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestClass {

    public static C makesA() {

        return new C() {
            @Override
            public void f() {

                System.out.println("public C.a() override from a_epam.A.a()");
            }

            public void g() {
                System.out.println("public C.g()");
            }

            void u() {
                System.out.println("package default C.u()");
            }

            protected void v() {
                System.out.println("protected C.v()");
            }

            private void w() {
                System.out.println("private C.w()");
            }
        };
    }


    public static void callHiddenMethod(Object ob, String methodName) throws Exception {

        Method g = ob.getClass().getDeclaredMethod(methodName);

        g.setAccessible(true);

        g.invoke(ob);
    }


    public static void main(String[] args) throws Exception {

        C c = makesA();

        c.f();

        c.g();

        c.u();

        c.v();


        final InnerA.C c1 = InnerA.makesA();

        c1.f();

        c1.v();

        c1.g();

        c1.u();


        System.out.println("name of the class C: " + c1.getClass().getName());

        callHiddenMethod(c1, "f");

        callHiddenMethod(c1, "g");

        callHiddenMethod(c1, "u");

        callHiddenMethod(c1, "v");

        callHiddenMethod(c1, "w");


        final A makes = HiddenC.makes();

        makes.f();

        System.out.println(makes.getClass().getName());


        final WithPrivateFinalField withPrivateFinalField = new WithPrivateFinalField();

        System.out.println(withPrivateFinalField);


        Field field = withPrivateFinalField.getClass().getDeclaredField("i");

        field.setAccessible(true);

        System.out.println("f.getInt: " + field.getInt(withPrivateFinalField));

        field.setInt(withPrivateFinalField, 12);

        System.out.println(withPrivateFinalField);

        field = withPrivateFinalField.getClass().getDeclaredField("s2");

        field.setAccessible(true);

        System.out.println("f.getString : " + field.get(withPrivateFinalField));

        field.setAccessible(true);

        field.set(withPrivateFinalField, "goodDay");

        System.out.println("after set: " + withPrivateFinalField);
    }
}
