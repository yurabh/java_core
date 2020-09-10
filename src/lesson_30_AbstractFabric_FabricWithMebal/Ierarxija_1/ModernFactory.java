package lesson_30_AbstractFabric_FabricWithMebal.Ierarxija_1;

import lesson_30_AbstractFabric_FabricWithMebal.*;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModerTable();
    }
//
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
