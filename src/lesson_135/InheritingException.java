package lesson_135;

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
