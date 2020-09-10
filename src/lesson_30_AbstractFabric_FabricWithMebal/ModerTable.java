package lesson_30_AbstractFabric_FabricWithMebal;

public class ModerTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Покласти на стіл стилю Модерн");
    }

    @Override
    public void clean() {
        System.out.println("Взяти зі стола Модерн");
    }
}
