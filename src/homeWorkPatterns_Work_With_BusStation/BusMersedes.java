package homeWorkPatterns_Work_With_BusStation;

public class BusMersedes implements Transportable {
    @Override
    public void arrivalOfTheBus() {
        System.out.println("Прибуття Автобуса Mersedes");
    }

    @Override
    public void loadingPassengers() {
        System.out.println("Загрузка пасажирів у автобус ");
    }

    @Override
    public void departingABus() {
        System.out.println("Відправлення автобуса Mersedes");
    }

    @Override
    public void unloadingPassengers() {
        System.out.println("Висадка пасажирів");
    }
}
