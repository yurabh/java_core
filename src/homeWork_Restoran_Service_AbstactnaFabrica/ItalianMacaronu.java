package homeWork_Restoran_Service_AbstactnaFabrica;

public class ItalianMacaronu implements Macaroni {
    @Override
    public void cookMacaroni() {
        System.out.println("Готуються Італійські Макарони");
    }

    @Override
    public void putOnsalePasta() {
        System.out.println("Виставлені на продаж Італійські макарони");
    }
}
