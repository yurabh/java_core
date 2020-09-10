package homeWork_Restoran_Service_AbstactnaFabrica;

public class ItalianDumplings implements Dumplings {
    @Override
    public void cookDumplings() {
        System.out.println("Готуються Італійські Пельмені");
    }

    @Override
    public void putOnsaleDumplings() {
        System.out.println("Виставлені на продаж Італійські  Пельмені");
    }
}
