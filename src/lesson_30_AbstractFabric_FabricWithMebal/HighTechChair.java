package lesson_30_AbstractFabric_FabricWithMebal;

public class HighTechChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Сісти на стілець стилю ХайТек");
    }

    @Override
    public void move() {
        System.out.println("Встати зі стільця стилю Хай Тек");
    }
}
