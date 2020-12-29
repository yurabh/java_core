package learn_exception.work_with_exception_first_example;

import learn_exception.work_with_exception_first_example.exception.SimpleException;

public class InheritingException {

    public void f() throws SimpleException {

        System.out.println("throw Simple Exception from f()");

        throw new SimpleException();
    }

    public static void main(String[] args) {

        InheritingException i = new InheritingException();

        try {

            i.f();

        } catch (SimpleException s) {
            System.out.println("catch this exception");
        }
    }
}
