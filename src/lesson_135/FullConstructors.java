package lesson_135;

public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("throw exception from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("throw MyException from g()");
        throw new MyException("Create in g()");
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
        }
    }
}
