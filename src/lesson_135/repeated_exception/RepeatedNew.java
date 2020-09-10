package lesson_135.repeated_exception;

import java.io.File;
import java.io.FileInputStream;

public class RepeatedNew {
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

        FileInputStream fileInputStream = new FileInputStream(new File("sd"));

        fileInputStream.close();
    }
}
