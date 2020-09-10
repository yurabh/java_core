package homeWork46;

import java.util.Objects;

public class Client implements Comparable<Client> {
    private String Name;
    private String SurName;

    public Client(String name, String surName) {
        Name = name;
        SurName = surName;
    }

    public void showKey() {
        System.out.println("Name: " + Name);
        System.out.println("SurName: " + SurName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(Name, client.Name) &&
                Objects.equals(SurName, client.SurName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, SurName);
    }

    @Override
    public String toString() {
        return " Name: " + Name + "-> SurName: " + SurName + '\n';
    }

    @Override
    public int compareTo(Client o) {
        if (Name.equals(o.Name) && SurName.equals(o.SurName))
            return 0;
        return -1;
    }
}
