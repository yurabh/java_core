package learn_exception.work_with_exception_first_example;

public class RepeatedException {

    public static void f() throws Exception {

        System.out.println("throw exception");

        throw new Exception("throw from f()");
    }

    public static void g() throws Exception {

        try {

            f();

        } catch (Exception e) {

            System.out.println("method g() ,e.printStackTrace()");

            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {

            f();

        } catch (Exception e) {

            System.out.println("method h() ,e.printStackTrace()");

            e.printStackTrace(System.out);

            throw (Exception) e.fillInStackTrace();
        }
    }


    public static void main(String[] args) {

        try {

            g();

        } catch (Exception e) {

            System.out.println("method main ,e.printStackTrace()");

            e.printStackTrace(System.out);
        }

        try {

            h();

        } catch (Exception e) {

            System.out.println("method main ,e.printStackTrace()");

            e.printStackTrace(System.out);
        }
    }
}
