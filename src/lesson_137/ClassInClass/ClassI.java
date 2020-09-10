package lesson_137.ClassInClass;

public class ClassI {
    private void f() {
    }

    class A {
        private void g() {
        }

        class B {
            void h() {
                g();
                f();
            }
        }
    }
}

class MultiNestingAccess {
    public static void main(String[] args) {
        ClassI classI = new ClassI();
        ClassI.A classIa = classI.new A();
        ClassI.A.B classIab = classIa.new B();
        classIab.h();
    }
}