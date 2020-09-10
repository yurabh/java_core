package homeWorkPatterns_Work_With_BusStation;

public abstract class BusStantion {

    public abstract Transportable buyAbus();

    public void busOnTheLine() {
        Transportable transportable = buyAbus();
        transportable.arrivalOfTheBus();
        transportable.loadingPassengers();
        transportable.departingABus();
        transportable.unloadingPassengers();
    }
}
