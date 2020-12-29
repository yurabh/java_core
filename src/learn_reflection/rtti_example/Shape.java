package learn_reflection.rtti_example;

public abstract class Shape {

    void draw() {
        System.out.println(this + " :draw()");
    }

    abstract public String toString();
}
