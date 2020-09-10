package lesson_30_AbstractFabric_FabricWithMebal;

public class HighTechSofa implements Sofa {
    @Override
    public void lainOn() {
        System.out.println("Лягти на ліжко стилю ХайТек");
    }

    @Override
    public void layOut() {
        System.out.println("Встати з ліжка Хай Тек");
    }
}
