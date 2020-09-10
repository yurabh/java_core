package lesson_130.bruce_eckel_examples.fifth_example;

public class ClassCast {
    public static void main(String[] args) {
        Building building = new House();

        Class<House> houseClass = House.class;

        House house = houseClass.cast(building);

        house = (House) building;
    }
}
