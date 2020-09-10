package lesson_10;

import homeWork9.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();

        Driver tdl2 = new Driver("Tolik", "Baday", 1200, 14, LocalDate.now(), "2",
                new Car(2, "Mersedes", "Bens", Color.red), 2);

        Operator op = new Operator("Yura", "Bahlay", 12, 14, LocalDate.now(),
                "0634", new ArrayList<>(), 3, LocalDate.now(), 1);

        staff.add(tdl2);
        staff.add(op);

        for (Employee employee : staff) {
            employee.increaseSalary(20);
            System.out.println("");
            employee.showInfo();
        }
    }
}
