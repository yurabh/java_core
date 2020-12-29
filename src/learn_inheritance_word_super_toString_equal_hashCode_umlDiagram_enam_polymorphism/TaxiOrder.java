package learn_inheritance_word_super_toString_equal_hashCode_umlDiagram_enam_polymorphism;

public class TaxiOrder {

    private int id;
    private Client client;
    private int priceOfThetrip;
    private String placeOfDeparture;
    private String placeOfArrival;
    private Payment payment;
    private Driver Driver;

    public TaxiOrder() {
        this.id = 0;
        this.client = null;
        this.priceOfThetrip = 12;
        this.placeOfDeparture = "Antonuca";
        this.placeOfArrival = "trylovskogo";
        this.payment = null;
        Driver = null;
    }

    public TaxiOrder(int id, Client client, int priceOfThetrip, String placeOfDeparture, String placeOfArrival,
                     Payment payment, Driver driver) {
        this.id = id;
        this.client = client;
        this.priceOfThetrip = priceOfThetrip;
        this.placeOfDeparture = placeOfDeparture;
        this.placeOfArrival = placeOfArrival;
        this.payment = payment;
        this.Driver = driver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getPriceOfThetrip() {
        return priceOfThetrip;
    }

    public void setPriceOfThetrip(int priceOfThetrip) {
        this.priceOfThetrip = priceOfThetrip;
    }

    public String getPlaceOfDeparture() {
        return placeOfDeparture;
    }

    public void setPlaceOfDeparture(String placeOfDeparture) {
        this.placeOfDeparture = placeOfDeparture;
    }

    public String getPlaceOfArrival() {
        return placeOfArrival;
    }

    public void setPlaceOfArrival(String placeOfArrival) {
        this.placeOfArrival = placeOfArrival;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Driver getDriver() {
        return Driver;
    }

    public void setDriver(Driver driver) {
        Driver = driver;
    }

    public void showTaxiOrder() {
        System.out.println("id ==" + id);
        System.out.println("Кліент == " + client);
        System.out.println("Ціна" + priceOfThetrip);
        System.out.println("Антонича == " + placeOfDeparture);
        System.out.println("Трильовського == " + placeOfArrival);
        System.out.println("Оплата == " + payment);
        System.out.println("Водій == " + Driver);
    }

    @Override
    public String toString() {
        return "TaxiOrder{" +
                "id=" + id +
                ", client=" + client +
                ", priceOfThetrip=" + priceOfThetrip +
                ", placeOfDeparture='" + placeOfDeparture + '\'' +
                ", placeOfArrival='" + placeOfArrival + '\'' +
                ", payment=" + payment +
                ", Driver=" + Driver +
                '}';
    }
}
