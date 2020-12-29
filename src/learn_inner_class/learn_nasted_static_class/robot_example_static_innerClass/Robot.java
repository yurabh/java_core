package learn_inner_class.learn_nasted_static_class.robot_example_static_innerClass;

import learn_inner_class.learn_nasted_static_class.person_example_static_innerClass.Null;

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

            System.out.println("name robot_example_static_innerClass:" + robot.name());

            System.out.println("name model:" + robot.model());

            for (Operation o : robot.operations()) {

                System.out.println(o.description());

                o.command();
            }
        }
    }
}
