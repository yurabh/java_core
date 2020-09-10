package lesson_137.annonimusTwo;

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Hi");
            }

            @Override
            public void f() {
                System.out.println("In anonymous class");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(1);

        base.f();
    }
}
