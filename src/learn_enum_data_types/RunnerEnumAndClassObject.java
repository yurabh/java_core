package learn_enum_data_types;

import learn_inheritance_word_super_tostring_equal_hashcode_uml_diagram_enam_polymorphism.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class RunnerEnumAndClassObject {

    public static void main(String[] args) {

        Client cli = new Client("Olesja", "olesivna", 12, "Antonucja");

        Driver td1 = new Driver("Orest", "Malonovic", 5000, 15, LocalDate.now(),
                "1", new Car(1, "Opel", "Vectra", Color.red), 1);

        Client cl = new Client();

        System.out.println(cli.toString());

        System.out.println(td1.toString());

        System.out.println(cli.equals(cl));

        Object[] per = {cli, td1};

        for (int i = 0; i < per.length; i++) {
            System.out.println(per[i].toString());
        }

        ArrayList<Employee> staff = new ArrayList<>();

        Client client2 = new Client("Olesja", "olesivna", 12, "Antonucja");

        Client cli1 = new Client("Stanja", "colosok", 14, "Antonucja");

        Client cli2 = new Client("Olesja", "olesivna", 12, "Antonucja");


        Driver driver1 = new Driver("Orest", "Malonovic", 5000, 15,
                LocalDate.now(), "1", new Car(1, "Opel",
                "Vectra", Color.red), 1);

        Driver tdl2 = new Driver("Tolik", "Baday", 1200, 14,
                LocalDate.now(), "2", new Car(2, "Opel",
                "Vectra", Color.red), 2);


        Driver tdl3 = new Driver("Vitja", "bayda", 2400, 14,
                LocalDate.now(), "3", new Car(3, "Audi",
                "T4", Color.red), 3);


        TaxiOrder or = new TaxiOrder(1, client2, 1, "trylovskoho", "Antonuca",
                new Payment(12, LocalDate.now()), driver1);


        TaxiOrder or1 = new TaxiOrder(2, client2, 2, "antonuca", "trylovskoho",
                new Payment(24, LocalDate.now()), tdl2);


        TaxiOrder or2 = new TaxiOrder(3, client2, 3, "gorodocjka", "Promuslova",
                new Payment(36, LocalDate.now()), tdl3);

        ArrayList<TaxiOrder> Tax = new ArrayList<>();

        Tax.add(or);
        Tax.add(or1);
        Tax.add(or2);


        Operator op = new Operator("Yura", "Bahlay", 12, 14, LocalDate.now(),
                "0634", Tax, 3, LocalDate.now(), 3);


        Operator op1 = new Operator("Tolik", "Juranuc", 12, 14, LocalDate.now(),
                "0634", Tax, 3, LocalDate.now(), 1);

        Operator op2 = new Operator("Gora", "Polickuy", 12, 14, LocalDate.now(),
                "0634", Tax, 3, LocalDate.now(), 3);


        ArrayList<Person> person1 = new ArrayList<>();

        Employee emp = new Employee("Oben", "kavasaki", 12, 12.44
                , LocalDate.now(), "0872342");
        Employee emp1 = new Employee("Obe4345", "kavasaki", 12, 12.44
                , LocalDate.now(), "0872342");

        person1.add(driver1);
        person1.add(tdl2);
        person1.add(tdl3);
        person1.add(client2);
        person1.add(cli1);
        person1.add(op);
        person1.add(op1);
        person1.add(emp);

        System.out.println(op.equals(op2));

        System.out.println("hesh cod == " + op.hashCode());
        System.out.println("hesh cod == " + op.hashCode());
        System.out.println("hesh cod == " + op1.hashCode());


        Apple ap;
        ap = Apple.Cortland;
        System.out.println("Apple : " + ap);
        System.out.println();

        if (ap == Apple.Goldendel) {
            System.out.println("Apple soderwitj ");
        } else {
            System.out.println("Ne rivne");
        }


        switch (ap) {
            case Cortland:
                System.out.println("Jabloko Cortoland Cervone");
                break;
            case Jonatan:
                System.out.println("Jabluco jonatan wovte");
                break;
            case Goldendel:
                System.out.println("Jabluko suney");
                break;

        }

        Apple ap1[] = Apple.values();
        for (Apple a : ap1) {
            System.out.println("Vuvid :" + a);
        }

        Apple ob;
        ob = Apple.valueOf("Goldendel");
        System.out.println("Povernennja: " + ob);

        Apple appleTwo;
        System.out.println("Winesar kowtye : " + Apple.Winesap.getPrice());
        System.out.println("Vsi koloru jabluk ");

        for (Apple i : Apple.values()) {
            System.out.println(i + "  kowtye: " + i.getPrice() + "  dolariv");
        }


        final int a = Apple.Winesap.ordinal();
        System.out.println("Порядковий номер == " + a);

        final int a1 = Apple.Winesap.compareTo(Apple.Winesap);
        System.out.println("porivnjnnja " + a1);

        Character obj = new Character('s');
        char e = obj.charValue();
        System.out.println("Вивід символа  " + e);

        Boolean bol = new Boolean(true);

        boolean z = bol.booleanValue();
        System.out.println("sNACENNJA BOOLEAN == " + z);

        Boolean ob1 = new Boolean("True");
        boolean z1 = ob1.booleanValue();
        System.out.println("Boolean == " + z1);

        Integer ob2 = new Integer(100);

        int i = ob2.intValue();
        System.out.println("Vuvid : " + i);


        Double Ob3 = new Double(12.33);

        double s = Ob3.doubleValue();

        System.out.println("Vuvid : " + s);

        Integer obo = 120;

        int i1 = obo;

        System.out.println("Cvcvc == " + i1);


        ArrayList<String> obj4 = new ArrayList<String>();

        System.out.println("Pocatkovauy erey list: " + obj4.size());

        obj4.add("a");
        obj4.add("b");
        obj4.add("c");
        obj4.add("d");
        obj4.add("e");
        obj4.add("f");

        System.out.println("Piclja vstavku: " + obj4.size());

        System.out.println("vUVID MASUV SPUSOK: " + obj4);

        obj4.remove("a");

        obj4.remove(2);
        System.out.println(": " + obj4.size());

        System.out.println("vUVID MASUV SPUSOK: " + obj4);


        ArrayList<String> obj2;

        obj2 = new ArrayList<String>();

        obj2.ensureCapacity(12);

        System.out.println("Vuvid : " + obj2.size());

        obj2.trimToSize();

        obj2.add("1");

        obj2.add("2");

        obj2.add("3");

        obj2.add("4");

        obj2.add(1, "baba");

        obj2.ensureCapacity(obj2.size() - 1);
    }
}
