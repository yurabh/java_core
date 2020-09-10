package homeWork_Restoran_Service_AbstactnaFabrica;

public class PolishDumplings implements Dumplings {
    @Override
    public void cookDumplings() {
        System.out.println("Готуються Польські Пельмені");
    }

    @Override
    public void putOnsaleDumplings() {
        System.out.println("Виставлені на продаж Польські Пельмені");
    }
}
