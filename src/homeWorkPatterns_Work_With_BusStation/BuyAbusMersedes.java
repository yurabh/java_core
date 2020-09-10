package homeWorkPatterns_Work_With_BusStation;

public class BuyAbusMersedes extends BusStantion {
    @Override
    public Transportable buyAbus() {
        return new BusMersedes();
    }
}
