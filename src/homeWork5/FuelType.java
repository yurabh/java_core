package homeWork5;

public enum FuelType {
    MUSTANG95(28), ORIGINAL95(27);
    private final double price;

    FuelType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
