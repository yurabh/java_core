package learn_reflection.rtti_example;

import java.util.Arrays;
import java.util.List;

public class Shapes {

    public static void main(String[] args) {

        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());

        for (Shape s : shapeList) {
            s.draw();
        }
    }
}
