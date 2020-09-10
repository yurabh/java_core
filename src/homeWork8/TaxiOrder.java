package homeWork8;

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

    public TaxiOrder(int id, Client client, int priceOfthetrip, String placeOfDeparture, String placeOfArrival,
                     Payment payment, homeWork8.Driver driver) {
        this.id = id;
        this.client = client;
        this.priceOfThetrip = priceOfthetrip;
        this.placeOfDeparture = placeOfDeparture;
        this.placeOfArrival = placeOfArrival;
        this.payment = payment;
        Driver = driver;
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

    public homeWork8.Driver getDriver() {
        return Driver;
    }

    public void setDriver(homeWork8.Driver driver) {
        Driver = driver;
    }
}

