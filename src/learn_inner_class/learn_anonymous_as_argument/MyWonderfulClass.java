package learn_inner_class.learn_anonymous_as_argument;

public class MyWonderfulClass {

    void go() {
        Bar b = new Bar();
        b.doStuff(new Foo() {
            public void foof() {
                System.out.println("foofy");
            }
        });
    }


    private void f() {
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int a = 10;
                System.out.println("output a: " + a);
            }
        };

        runnable.run();
    }


    public static void main(String[] args) {
        MyWonderfulClass myWonderfulClass = new MyWonderfulClass();

        myWonderfulClass.f();

        myWonderfulClass.go();
    }
}


interface Foo {
    void foof();
}


class Bar {
    void doStuff(Foo f) {
        System.out.println("hi");
        f.foof();
    }
}
