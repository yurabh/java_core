package lesson_41_Generick_Intarface;

public class Order implements Identify<Integer> {
    private int id;

    public Order(int id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                '}';
    }
}
