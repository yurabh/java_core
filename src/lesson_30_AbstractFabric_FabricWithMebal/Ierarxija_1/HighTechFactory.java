package lesson_30_AbstractFabric_FabricWithMebal.Ierarxija_1;

import lesson_30_AbstractFabric_FabricWithMebal.*;

public class HighTechFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new HighTechChair();
    }

    @Override
    public Table createTable() {
        return new HighTechTable();
    }

    @Override//
    public Sofa createSofa() {
        return new HighTechSofa();
    }
}
