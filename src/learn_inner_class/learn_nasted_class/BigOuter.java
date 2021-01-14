package learn_inner_class.learn_nasted_class;

public class BigOuter {
    static class Nest {
        void go() {
            System.out.println("hi");
        }
    }
}

class Broom {
    static class Broom2 {
        void goB2() {
            System.out.println("hi 2");
        }
    }
}


class Test {

    public static void main(String[] args) {

        BigOuter.Nest n = new BigOuter.Nest();

        n.go();

        Broom.Broom2 broom2 = new Broom.Broom2();

        broom2.goB2();
    }
}
