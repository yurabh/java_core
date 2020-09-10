package homeWork9;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListRunner {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Client cli = new Client("Olesja", "olesivna", 12, "Antonucja");

        Client cli1 = new Client("Olesja", "olesivna", 12, "Antonucja");

        Client cli2 = new Client("Olesja", "olesivna", 12, "Antonucja");


        Driver td1 = new Driver("Orest", "Malonovic", 5000, 15, LocalDate.now(), "1",

                new Car(1, "Opel", "Vectra", Color.red), 1);

        Driver tdl2 = new Driver("Tolik", "Baday", 1200, 14, LocalDate.now(), "2",
                new Car(2, "Mersedes", "Bens", Color.red), 2);


        Driver tdl3 = new Driver("Vitja", "bayda", 2400, 14, LocalDate.now(), "3",
                new Car(3, "Audi", "T4", Color.red), 3);


        TaxiOrder or = new TaxiOrder(1, cli, 1, "trylovskoho", "Antonuca",
                new Payment(12, LocalDate.now()), td1);


        TaxiOrder or1 = new TaxiOrder(2, cli, 2, "antonuca", "trylovskoho",
                new Payment(24, LocalDate.now()), tdl2);


        TaxiOrder or2 = new TaxiOrder(3, cli, 3, "gorodocjka", "Promuslova",
                new Payment(36, LocalDate.now()), tdl3);

        ArrayList<TaxiOrder> Tax = new ArrayList<>();

        Tax.add(or);
        Tax.add(or1);
        Tax.add(or2);

        Operator op = new Operator("Yura", "Bahlay", 12, 13.3, LocalDate.now(),
                "0634", Tax, 3, LocalDate.now(), 1);

        Operator op1 = new Operator("Tolik", "Juranuc", 24, 134.3, LocalDate.now(),
                "063424242", Tax, 3, LocalDate.now(), 2);

        Operator op2 = new Operator("Gora", "Polickuy", 36, 13.3, LocalDate.now(),
                "06341213", Tax, 3, LocalDate.now(), 3);


        persons.add(new Client("Olesja", "olesivna", 12, "Antonucja"));

        persons.add(cli1);

        persons.add(cli2);

        persons.add(td1);

        persons.add(tdl2);

        persons.add(tdl2);

        persons.add(op);

        persons.add(op1);

        persons.add(op2);

        System.out.println();


        int countDriver = 0, countOperator = 0, countClient = 0;
        int countOperatorTwo = 0;
        for (Person iterator : persons) {
            if (iterator instanceof Driver) {
                countDriver++;
            }
            if (iterator instanceof Operator) {
                countOperator++;
            }
            if (iterator instanceof Client) {
                countClient++;
            }

            if (iterator instanceof Operator) {
                if (((Operator) iterator).getCountOrder() != 0) {
                    countOperatorTwo += ((Operator) iterator).getCountOrder();
                }
            }


            for (Person i : persons) {
                if (i instanceof Driver) {
                    ((Driver) i).showInfo();
                    System.out.println();
                }
            }
        }

        System.out.println("Кількість Водіїв кі працюють у компанії == " + countDriver + "\n");

        System.out.println("Кількість Операторів які працюють у компанії == " + countOperatorTwo + "\n");

        System.out.println("Кількість замовлень кліентами у компанії == " + countClient + "\n");

        System.out.println("Кількість прийнятих замовлень Операторами == " + countOperatorTwo + "\n");


        int size = persons.size();

        System.out.println();

        System.out.println("Кількість елементів у ArrayList == persons: " + size);
    }

}
