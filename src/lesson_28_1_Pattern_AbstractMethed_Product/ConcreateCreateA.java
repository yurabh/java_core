package lesson_28_1_Pattern_AbstractMethed_Product;

public class ConcreateCreateA extends Creater {
    public Product createrProduct() {
        return new ProductA();
    }
}
