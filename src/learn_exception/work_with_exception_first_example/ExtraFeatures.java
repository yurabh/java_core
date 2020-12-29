package learn_exception.work_with_exception_first_example;

import learn_exception.work_with_exception_first_example.exception.MyException;

public class ExtraFeatures {

    public static void f() throws MyException {
        System.out.println("throw MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("throw MyException from g()");
        throw new MyException("Create in g()");
    }

    public static void h() throws MyException {
        System.out.println("throw MyException from h()");
        throw new MyException("Create in h())", 47);
    }

    public static void main(String[] args) {

        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
            String message = e.getMessage();
            System.out.println(message);
        }

        try {
            h();
        } catch (MyException e) {
            e.printStackTrace(System.out);
            System.out.println("e.value: " + e.value());
        }
    }
}
