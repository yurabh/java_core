package lesson_30_AbstractFabric_FabricWithMebal;

public class PopArtChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сісти на стілець стилю PopArtChairt");
    }

    @Override
    public void move() {
        System.out.println("Встати зі стільця стилю Pop art Chairs");
    }
}
