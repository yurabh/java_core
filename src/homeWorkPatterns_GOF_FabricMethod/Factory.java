package homeWorkPatterns_GOF_FabricMethod;

public abstract class Factory {
    public abstract Creatable create();

    public void furnitureCreateFabrika() {
        Creatable production = create();
        production.createProduction();
        production.Gluingachair("PVA");
        production.chopWorkpieces("Selenuy");
        production.cutTheWorkpiece(1, 2, 3, 4);
        production.show();
    }
}
