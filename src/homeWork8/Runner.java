package homeWork8;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {

        Employee Employ = new Employee("Oleh", "Mironow", 12, 32,
                LocalDate.now(), "4343434");

        Person person;


        Client client = new Client();
        Client client1 = new Client();
        Client client2 = new Client();

        Car car1 = new Car(123456, "Opel", "Forex", "Biluy");
        Car car2 = new Car(123, "Opel", "Cadet", "Biluy");
        Car car3 = new Car(456, "Opel", "vactra", "Suniy");
        Car car4 = new Car(56, "Opel", "Zafira", "Wovtyu");
        Car[] Cars = new Car[5];


        Cars[0] = car1;
        Cars[1] = car2;
        Cars[2] = car3;
        Cars[3] = car4;


        Payment payment = new Payment();

        Driver driver0 = new Driver();
        Driver driver1 = new Driver();
        Driver driver2 = new Driver();
        Driver[] drivers = new Driver[3];

        drivers[0] = driver0;
        drivers[1] = driver1;
        drivers[2] = driver2;


        TaxiOrder taxiOrder4 = new TaxiOrder(11, client, 60, "trylovskoho 23",
                "antonuca 1", payment, driver1);
        TaxiOrder taxiOrder3 = new TaxiOrder(12, client, 120, "trylovskoho 232",
                "antonuca 3 ", payment, driver0);
        TaxiOrder taxiOrder2 = new TaxiOrder(13, client, 120, "trylovskoho 3232",
                "antonuca 3232", payment, driver0);
        TaxiOrder taxiOrder1 = new TaxiOrder(14, client, 120, "trylovskoho 322322",
                "antonuca 322", payment, driver2);

        TaxiOrder[] taxiOrder = new TaxiOrder[4];


        Operator operator = new Operator("kola", "baranuc", 123, 11.55, java.time.
                LocalDate.now(), "1234434", taxiOrder, 11, java.time.LocalDate.now(),
                12);

        Operator operator1 = new Operator("kola", "baranuc", 123,
                11.55, java.time.LocalDate.now(), "1234434", taxiOrder, 11,
                java.time.LocalDate.now(), 12);

        Operator operator2 = new Operator("kola", "baranuc", 123, 11.55,
                java.time.LocalDate.now()
                , "1234434", taxiOrder, 11, java.time.LocalDate.now(),
                12);

        Operator operator3 = new Operator("kola", "baranuc", 123, 11.55,
                java.time.LocalDate.now()
                , "1234434", taxiOrder, 11, java.time.LocalDate.now(),
                12);

        Operator[] operators = new Operator[4];
        operators[0] = operator;
        operators[1] = operator1;
        operators[2] = operator2;
        operators[3] = operator3;


//        for (int i = 0; i < employ.length; i++) {
//            System.out.println("Name : " + Employee[i].getName());
//        }
//
//        for (Employee staff : employee) {
//            System.out.println("Name : " + staff.getName());
//            staff.increaseSalary(20);
//        }
    }
}
