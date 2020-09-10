package lesson_30_AbstractFabric_FabricWithMebal;

public class PopArtTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Покласти на стіл стилю  ПопАртСтіл");
    }

    @Override
    public void clean() {
        System.out.println("Взяти зі стола ПопАртСтіл");
    }
}
