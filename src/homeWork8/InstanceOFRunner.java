package homeWork8;

import java.time.LocalDate;

public class InstanceOFRunner {
    public static void main(String[] args) {
        Person persons[] = new Person[10];

        Driver td1 = new Driver("Orest", "Malonovic", 5000, 15, LocalDate.now(), "1",

                new Car(1, "Opel", "Vectra", "Biluy"), 1);

        Driver tdl2 = new Driver("Tolik", "Baday", 1200, 14, LocalDate.now(), "2",
                new Car(2, "Mersedes", "Bens", "yellow"), 2);


        Driver tdl3 = new Driver("Vitja", "bayda", 2400, 14, LocalDate.now(), "3",
                new Car(3, "Audi", "T4", "Blu"), 3);


        Client cli = new Client("Olesja", "olesivna", 12, "Antonucja");

        Client cli1 = new Client("Olesja", "olesivna", 12, "Antonucja");

        Client cli2 = new Client("Olesja", "olesivna", 12, "Antonucja");


        TaxiOrder or = new TaxiOrder(1, cli, 1, "trylovskoho", "Antonuca",
                new Payment(12, LocalDate.now()), td1);


        TaxiOrder or1 = new TaxiOrder(2, cli, 2, "antonuca", "trylovskoho",
                new Payment(24, LocalDate.now()), tdl2);


        TaxiOrder or2 = new TaxiOrder(3, cli, 3, "gorodocjka", "Promuslova",
                new Payment(36, LocalDate.now()), tdl3);

        TaxiOrder[] Tax = new TaxiOrder[3];

        Tax[0] = or;
        Tax[1] = or1;
        Tax[2] = or2;


        Operator op = new Operator("Yura", "Bahlay", 12, 13.3, LocalDate.now(),
                "0634", Tax, 3, LocalDate.now(), 1);

        Operator op1 = new Operator("Tolik", "Juranuc", 24, 134.3, LocalDate.now(),
                "063424242", Tax, 3, LocalDate.now(), 2);

        Operator op2 = new Operator("Gora", "Polickuy", 36, 13.3, LocalDate.now(),
                "06341213", Tax, 3, LocalDate.now(), 3);


        persons[0] = new Client("Mh", "Nazar", 68, "IF");
        persons[1] = td1;
        persons[2] = op;
        persons[3] = tdl2;
        persons[4] = op1;
        persons[5] = tdl3;
        persons[6] = op2;
        persons[7] = cli;
        persons[8] = cli1;
        persons[9] = cli2;


        System.out.println();

        for (Person i : persons) {
            i.showInfo();
        }

        System.out.println();

        for (Person i : persons) {
            if (i instanceof Driver) {
                i.showInfo();
                ((Driver) i).getHours();
                ((Driver) i).driverShow();
                System.out.println();
            }
        }


        int countDriver = 0, countOperator = 0, countClient = 0;
        int countOperatorOne = 0;
        for (Person iterator : persons) {
            if (iterator instanceof Driver) {
                System.out.println();
                ((Driver) iterator).driverShow();
                System.out.println();
                countDriver++;
            }
            if (iterator instanceof Operator) {
                countOperatorOne++;
            }
            if (iterator instanceof Client) {
                countClient++;
            }

            if (iterator instanceof Operator) {
                if (((Operator) iterator).getCountOrder() != 0) {
                    countOperatorOne += ((Operator) iterator).getCountOrder();
                }
            }

        }

        System.out.println("Кількість Водіїв кі працюють у компанії == " + countDriver + "\n");

        System.out.println("Кількість Операторів які працюють у компанії == " + countOperatorOne + "\n");

        System.out.println("Кількість замовлень кліентами у компанії == " + countClient + "\n");

        System.out.println("Кількість прийнятих замовлень Операторами == " + countOperatorOne + "\n");
    }
}