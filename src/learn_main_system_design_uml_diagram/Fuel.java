package learn_main_system_design_uml_diagram;

public enum Fuel {
    Bensum96(12.3), bensun92(14.55), Dizel(12.23);

    private double price;

    Fuel(double price) {
        this.price = price;
    }

    public final double getPrice() {
        return price;
    }
}
