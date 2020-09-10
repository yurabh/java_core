package lesson_135;

public class NestingInterfaces {

    public class BInp implements A.B {
        @Override
        public void f() {
        }
    }

    class CiImp implements A.C {
        @Override
        public void f() {
        }
    }

    class EImp implements E {
        @Override
        public void g() {
        }
    }

    class EGimp implements E.G {
        @Override
        public void f() {
        }
    }

    class EImp2 implements E {
        @Override
        public void g() {
        }
    }

    class EH implements E.H {
        @Override
        public void f() {
        }
    }

    public static void main(String[] args) {
        A a = new A();
//        first_example.D ad = a.getD();

        A.DImp2 di2 = (A.DImp2) a.getD();

//        a.getD().f();

        A a2 = new A();

        a2.receivedD(a.getD());
    }
}
