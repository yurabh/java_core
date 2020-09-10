package homeWorkPatterns_GOF_FabricMethod;

public class TableFactory extends Factory {
    public Creatable create() {
        return new Table();
    }
}
