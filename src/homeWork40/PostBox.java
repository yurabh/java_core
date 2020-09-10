package homeWork40;

public class PostBox extends Box {
    private int id;
    private int weight;

    public PostBox(int width, int height, int depht, int id, int weight) {
        super(width, height, depht);
        this.id = id;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }
}
