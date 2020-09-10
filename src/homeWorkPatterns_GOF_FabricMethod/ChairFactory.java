package homeWorkPatterns_GOF_FabricMethod;

public class ChairFactory extends Factory {
    public Creatable create() {
        return new Chair();
    }
}
