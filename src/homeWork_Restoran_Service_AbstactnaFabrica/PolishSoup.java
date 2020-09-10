package homeWork_Restoran_Service_AbstactnaFabrica;

public class PolishSoup implements Soup {
    @Override
    public void cookSoup() {
        System.out.println("Готуються Польський Суп");
    }

    @Override
    public void putOnsaleSoup() {
        System.out.println("Виставлені на продахж Польський Суп");
    }
}
