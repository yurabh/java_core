package homeWork_Restoran_Service_AbstactnaFabrica;

public class UkrainianMacaronu implements Macaroni {
    @Override
    public void cookMacaroni() {
        System.out.println("Готуються Украінські Макарони");
    }

    @Override
    public void putOnsalePasta() {
        System.out.println("Виставлені на продаж украінські макарони");
    }
}
