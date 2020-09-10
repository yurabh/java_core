package homeWork_Restoran_Service_AbstactnaFabrica.Ierarxija1;

import homeWork_Restoran_Service_AbstactnaFabrica.Dumplings;
import homeWork_Restoran_Service_AbstactnaFabrica.Macaroni;
import homeWork_Restoran_Service_AbstactnaFabrica.Soup;

public interface Restoranizable  {

   public Macaroni prepareMacaroni();
   public Soup prepareSoup();
   public Dumplings prepareDumplings();

}
