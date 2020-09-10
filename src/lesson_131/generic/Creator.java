package lesson_131.generic;

public class Creator extends GenericWithCreate<X> {
    @Override
    X create() {
        return new X();
    }

    public void f() {
        System.out.println(element.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Creator creator = new Creator();

        creator.f();
    }
}
