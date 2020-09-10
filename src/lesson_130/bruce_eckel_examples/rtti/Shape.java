package lesson_130.bruce_eckel_examples.rtti;

public abstract class Shape {
    void draw() {
        System.out.println(this + " :draw()");
    }

    abstract public String toString();
}
