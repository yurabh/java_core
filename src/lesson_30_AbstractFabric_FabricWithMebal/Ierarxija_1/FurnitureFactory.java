package lesson_30_AbstractFabric_FabricWithMebal.Ierarxija_1;

import lesson_30_AbstractFabric_FabricWithMebal.Chair;
import lesson_30_AbstractFabric_FabricWithMebal.Sofa;
import lesson_30_AbstractFabric_FabricWithMebal.Table;
public interface FurnitureFactory {

    public Chair createChair();

    public Table createTable();

    public Sofa createSofa();
}
