package homeWork_Restoran_Service_AbstactnaFabrica;

import homeWork_Restoran_Service_AbstactnaFabrica.Ierarxija1.Restoranizable;

public class RestorauntClient {
    public Restoranizable restoranizable;
    public Macaroni macaroni;
    public Soup soup;
    public Dumplings dumplings;

    public RestorauntClient(Restoranizable restoranizable) {
        this.restoranizable = restoranizable;
        this.macaroni = restoranizable.prepareMacaroni();
        this.soup = restoranizable.prepareSoup();
        this.dumplings = restoranizable.prepareDumplings();
    }

    public void checkingMacaroni() {
        this.macaroni.cookMacaroni();
        this.macaroni.putOnsalePasta();
    }


    public void checkingSoup() {
        this.soup.cookSoup();
        this.soup.putOnsaleSoup();
    }

    public void checkingDumplings() {
        this.dumplings.cookDumplings();
        this.dumplings.putOnsaleDumplings();
    }
}
