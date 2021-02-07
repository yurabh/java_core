package learn_map.second_example;

import java.util.Objects;

public class Client implements Comparable<Client> {

    private String name;
    private String surName;

    public Client(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public void showKey() {
        System.out.println("name: " + name);
        System.out.println("surName: " + surName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(surName, client.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }

    @Override
    public String toString() {
        return " name: " + name + "-> surName: " + surName + '\n';
    }

    @Override
    public int compareTo(Client o) {
        if (name.equals(o.name) && surName.equals(o.surName))
            return 0;
        return -1;
    }
}
