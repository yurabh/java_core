package learn_reflection.second_example;

public class FancyToy extends Toy implements HasBattery, Waterproof, Shoots {
    public FancyToy() {
        super(1);
    }
}
