package lesson_137.InnerClassTwo;

public class DoThis {

    void f() {
        System.out.println("DoThis");
    }

    public class Inner {
        public DoThis outer() {
            return DoThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DoThis doThis = new DoThis();

        DoThis.Inner inner = doThis.inner();

        inner.outer().f();
    }
}
