package homeWork_Restoran_Service_AbstactnaFabrica;

public class PolishMacaroni implements Macaroni {
    @Override
    public void cookMacaroni() {
        System.out.println("Готуються Польські Макарони");
    }

    @Override
    public void putOnsalePasta() {
        System.out.println("Виставлені на продаж Польсткі Макарони макарони");
    }
}
