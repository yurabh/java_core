package learn_instanceof_arrays_desing_uml_second_example;

public class TaxiOrder {

    private int id;
    private Client client;
    private int priceOfTetrip;
    private String placeOfDeparture;
    private String placeOfArrival;
    private Payment payment;
    private Driver driver;

    public TaxiOrder() {
        this.id = 0;
        this.client = null;
        this.priceOfTetrip = 12;
        this.placeOfDeparture = "Antonuca";
        this.placeOfArrival = "trylovskogo";
        this.payment = null;
        this.driver = null;
    }

    public TaxiOrder(int id, Client client, int priceOfthetrip, String placeOfDeparture, String placeOfArrival,
                     Payment payment, learn_instanceof_arrays_desing_uml_second_example.Driver driver) {
        this.id = id;
        this.client = client;
        this.priceOfTetrip = priceOfthetrip;
        this.placeOfDeparture = placeOfDeparture;
        this.placeOfArrival = placeOfArrival;
        this.payment = payment;
        this.driver = driver;
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

    public int getPriceOfTetrip() {
        return priceOfTetrip;
    }

    public void setPriceOfTetrip(int priceOfTetrip) {
        this.priceOfTetrip = priceOfTetrip;
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
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
