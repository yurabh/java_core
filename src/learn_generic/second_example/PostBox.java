package learn_generic.second_example;

public class PostBox extends Box {

    private int id;
    private int weight;

    public PostBox(int width, int height, int depth, int id, int weight) {
        super(width, height, depth);
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
