package learn_inner_class.learn_inner_class;

public class Outer {

    private String greeting = "Hi";

    class Inner {

        public int repeat = 3;

        void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }
        }
    }
}

class Test {

    public static void main(String[] args) {

        Outer.Inner inner = new Outer().new Inner();

        inner.go();

        Outer outer = new Outer();

        Outer.Inner inner1 = outer.new Inner();

        inner1.go();
    }
}
