package learn_access_modifiers.third_example;

public class Lunch {

    static void testPrivate() {
        Soup1 soup1 = Soup1.makeSoup();
        soup1.f();
    }

    static void testStatic() {
        Soup2.access().f();
    }

    public static void main(String[] args) {
        testPrivate();

        testStatic();
    }
}


class Soup1 {
    private Soup1() {
    }

    public static Soup1 makeSoup() {
        return new Soup1();
    }

    protected void f() {
        System.out.println("my");
    }
}


class Soup2 {
    private Soup2() {
    }

    public static Soup2 access() {
        return new Soup2();
    }

    public void f() {
        System.out.println("Hi hello");
    }
}
