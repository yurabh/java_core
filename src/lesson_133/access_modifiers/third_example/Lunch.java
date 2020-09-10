package lesson_133.access_modifiers.third_example;

public class Lunch {

    void testPrivvate() {
        Soup1 soup1 = Soup1.makeSoup();
    }

    void testStatic() {
        Soup2.access().f();
    }
}

class Soup1 {
    private Soup1() {
    }

    public static Soup1 makeSoup() {
        return new Soup1();
    }
}


class Soup2 {
    private Soup2() {
    }

    private static Soup2 soup2 = new Soup2();

    public static Soup2 access() {
        return soup2;
    }

    public void f() {
    }
}