package learn_clone_cloneable;

public class TestCloneable {
    public static void main(String[] args)
            throws CloneNotSupportedException {

        Department dept = new Department(1, "Human Resource");

        Employee original = new Employee(2, "Admin", dept);

        Employee cloned = (Employee) original.clone();

        System.out.println(cloned.getEmployeeId());

        System.out.println(original != cloned);

        System.out.println(original.getClass() == cloned.getClass());

        System.out.println(original.equals(cloned));

        cloned.getDepartment().setName("Finance");

        System.out.println(original.getDepartment().getName());

        System.out.println(cloned.getDepartment().getName());
    }
}
