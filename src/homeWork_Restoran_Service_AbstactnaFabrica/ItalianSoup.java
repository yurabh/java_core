package homeWork_Restoran_Service_AbstactnaFabrica;

public class ItalianSoup implements Soup {
    @Override
    public void cookSoup() {
        System.out.println("Готуються Італійський Суп");
    }

    @Override
    public void putOnsaleSoup() {
        System.out.println("Виставлені на продахж Італійський Суп");
    }
}
