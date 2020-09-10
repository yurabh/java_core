package homeWork9;

import java.util.ArrayList;

public class StaticFieldsRunner {
    public static void main(String[] args) {
//        System.out.println(Employee.nextID);
//        System.out.println(Math.PI);


        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee());
        staff.add(new Employee("Nazar", "Mh", "068"));
        staff.add(new Employee("Yra", "Bahlay", "098"));


        for (Employee em : staff) {
            System.out.println(em.toString());
        }
    }
}
