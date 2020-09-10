package homeWork_Restoran_Service_AbstactnaFabrica;

public class UkrainianSoup implements Soup {

    @Override
    public void cookSoup() {
        System.out.println("Готуються Украінський Суп");
    }

    @Override
    public void putOnsaleSoup() {
        System.out.println("Виставлені на продахж украінський Суп");
    }
}
