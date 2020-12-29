package learn_reflection.fifth_example;

public class ClassCast {

    public static void main(String[] args) {

        Building building = new House();

        Class<House> houseClass = House.class;

        House house = houseClass.cast(building);

        House house1 = (House) building;
    }
}
