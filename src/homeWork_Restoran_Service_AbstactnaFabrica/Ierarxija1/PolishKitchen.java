package homeWork_Restoran_Service_AbstactnaFabrica.Ierarxija1;

import homeWork_Restoran_Service_AbstactnaFabrica.*;

public class PolishKitchen implements Restoranizable {
    @Override
    public Macaroni prepareMacaroni() {
        return new PolishMacaroni();
    }

    @Override
    public Soup prepareSoup() {
        return new PolishSoup();
    }

    @Override
    public Dumplings prepareDumplings() {
        return new PolishDumplings();
    }
}
