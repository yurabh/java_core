package lesson_9;

import homeWork8.Client;
import homeWork8.Person;

import java.util.ArrayList;

public class lesson_9_1 {

    public static void main(String[] args) {

        Person persons[] = new Person[3];

        ArrayList<Person> personArrayList = new ArrayList<Person>();

        persons[0] = new Client("Nazar", "Mh", 68, "IF");

        personArrayList.add(new Client("Nazar", "Mh", 68, "IF"));

        System.out.println(persons[0]);

        System.out.println(personArrayList.get(0));

        personArrayList.add(new Client("Yuriy", "bahlay", 12, "switch"));

        personArrayList.add(1, new Client("Tomas", "Clabro", 123, "wor"));

        personArrayList.ensureCapacity(166);

        for (Person I : personArrayList) {
            System.out.println("Client" + I);
        }
        personArrayList.ensureCapacity(1200);

        System.out.println();

        int z = personArrayList.size();

        System.out.println("Кільксть елементів == " + z);

        personArrayList.remove(1);

        for (Person I : personArrayList) {
            System.out.println("Client" + I);
        }
        Person ob = new Client("Yuriy", "bahlay", 12, "switch");

        personArrayList.remove(ob);

        for (Person I : personArrayList) {
            System.out.println("Client" + I);
        }

        boolean z1 = personArrayList.isEmpty();
        if (z1 == true) {
            System.out.println("Pustuy");
        } else {
            System.out.println("Ne pustuy");
        }

        personArrayList.clear();

        System.out.println("Кільсть елементів після очищення == " + personArrayList.size());


        ArrayList<Person> ob3 = new ArrayList<>();

        ob3 = (ArrayList<Person>) personArrayList.clone();

        System.out.println("Клон арей ліст");

        for (Person I : personArrayList) {

            System.out.println("Client" + I);
        }

        boolean g = personArrayList.contains(new Client("Nazar", "Mh", 68, "IF"));

        if (g == true) {
            System.out.println("Zbigaetjsja))");
        } else {
            System.out.println("nE SBIGARTJSJA");
        }

        int h = personArrayList.indexOf(new Client("Nazar", "Mh", 68, "IF"));
        System.out.println("index == " + h);

        for (Person I : personArrayList) {
            System.out.println("Client" + I);
        }

        Object ob4[] = new Object[personArrayList.size()];

        ob4 = personArrayList.toArray();

        System.out.println();

        for (int i = 0; i < ob4.length; i++) {
            System.out.println(ob4[i].toString());
        }
    }
}
