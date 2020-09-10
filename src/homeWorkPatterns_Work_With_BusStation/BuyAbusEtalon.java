package homeWorkPatterns_Work_With_BusStation;

public class BuyAbusEtalon extends BusStantion {
    @Override
    public Transportable buyAbus() {
        return new BusEtalon();
    }
}
