package lesson_130.bruce_eckel_examples.null_object.robot;

import lesson_130.bruce_eckel_examples.null_object.person_position.Null;

import java.util.List;

public interface Robot {
    String name();

    String model();

    List<Operation> operations();

    class Test {
        public static void test(Robot robot) {
            if (robot instanceof Null) {
                System.out.println("Null Robot");
            }
            System.out.println("name robot:" + robot.name());
            System.out.println("name model:" + robot.model());

            for (Operation o : robot.operations()) {
                System.out.println(o.description());
                o.command();
            }
        }
    }
}
