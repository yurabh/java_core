package learn_generic.second_example;

public class Parcel extends PostBox {

    private String client;

    public Parcel(int width, int height, int depth, int id, int weight, String client) {
        super(width, height, depth, id, weight);
        this.client = client;
    }

    public String getClient() {
        return client;
    }
}
