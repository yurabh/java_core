package lesson_41_Generick_Intarface;

public class Product implements Identify<Integer> {
    private int id;

    public Product(int id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                '}';
    }
}
