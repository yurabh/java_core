package lesson_131.generic;

public abstract class GenericWithCreate<T> {

    final T element;

    public GenericWithCreate() {
        this.element = create();
    }

    abstract T create();
}
