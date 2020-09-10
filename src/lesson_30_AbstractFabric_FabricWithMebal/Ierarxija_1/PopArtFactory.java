package lesson_30_AbstractFabric_FabricWithMebal.Ierarxija_1;

import lesson_30_AbstractFabric_FabricWithMebal.*;

public class PopArtFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new PopArtChair();
    }

    @Override
    public Table createTable() {
        return new PopArtTable();
    }

    @Override
    public Sofa createSofa() {
        return new PopArtSofa();
    }
}
