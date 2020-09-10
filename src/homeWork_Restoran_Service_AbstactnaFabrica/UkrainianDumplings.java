package homeWork_Restoran_Service_AbstactnaFabrica;

public class UkrainianDumplings implements Dumplings {

    @Override
    public void cookDumplings() {
        System.out.println("Готуються Украінські Пельмені");
    }

    @Override
    public void putOnsaleDumplings() {
        System.out.println("Виставлені на продаж украінські Пельмені");
    }
}
