package lesson_30_AbstractFabric_FabricWithMebal;

import lesson_30_AbstractFabric_FabricWithMebal.Ierarxija_1.FurnitureFactory;

public class FactoryClient {

    private FurnitureFactory furnitureFactory;
    private Chair chair;
    private Table table;
    private Sofa sofa;

    public FactoryClient(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
        this.chair = furnitureFactory.createChair();
        this.table = furnitureFactory.createTable();
        this.sofa = furnitureFactory.createSofa();
    }

    public void testChair() {
        this.chair.sitOn();
        this.chair.move();
    }

    public void testTable() {
        this.table.putOn();
        this.table.clean();
    }

    public void testSofa() {
        this.sofa.lainOn();
        this.sofa.layOut();
    }
}
