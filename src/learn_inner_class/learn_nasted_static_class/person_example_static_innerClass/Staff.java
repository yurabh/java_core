package learn_inner_class.learn_nasted_static_class.person_example_static_innerClass;

import java.util.ArrayList;

public class Staff extends ArrayList<Position> {

    public void add(String title, Person person) {
        add(new Position(title, person));
    }

    public void add(String... titles) {
        for (String title : titles) {
            add(new Position(title));
        }
    }

    public Staff(String... titles) {
        add(titles);
    }

    public boolean positionAvailable(String title) {
        for (Position position : this) {
            if (position.getTitle().equals(title) && position.getPerson() == Person.NULL) {
                return true;
            }
        }
        return false;
    }

    public void fillPosition(String title, Person hire) {
        for (Position position : this) {
            if (position.getTitle().equals(title) && position.getPerson() == Person.NULL) {
                position.setPerson(hire);
                return;
            }
        }
        throw new RuntimeException("Position is not available");
    }

    public static void main(String[] args) {

        Staff staff = new Staff("SoftWare Engineer", "Project Lead",
                "Presidents", "Cto", "Marketing Manager", "Product Manager");

        staff.fillPosition("Presidents", new Person("Me", "Last", "The topLonely at"));

        staff.fillPosition("Project Lead", new Person("Janet", "Planer", "The top"));

        if (staff.positionAvailable("SoftWare Engineer")) {

            staff.fillPosition("SoftWare Engineer", new Person("Bob", "Coder", "Bright Light"));
        }
        System.out.println(staff);
    }
}
