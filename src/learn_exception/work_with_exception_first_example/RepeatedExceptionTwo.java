package learn_exception.work_with_exception_first_example;

import learn_exception.work_with_exception_first_example.exception.OneException;
import learn_exception.work_with_exception_first_example.exception.TwoException;

public class RepeatedExceptionTwo {

    public static void f() throws OneException {

        System.out.println("throw in F()");

        throw new OneException("from f()");
    }

    public static void main(String[] args) throws Exception {
        try {

            try {

                f();

            } catch (OneException e) {

                System.out.println("Перехвачено в внутрішньому блоці трай");

                e.printStackTrace(System.out);

                throw new TwoException("из внутрінього блака трай");

            }
        } catch (TwoException e) {

            System.out.println("перехвачено у зовнішньому блоці трай");

            System.out.println(System.out);
        }
    }
}
