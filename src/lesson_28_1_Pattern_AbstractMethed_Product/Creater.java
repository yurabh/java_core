package lesson_28_1_Pattern_AbstractMethed_Product;

public abstract class Creater {
    public abstract Product createrProduct();
    public void RealisationProduct() {
        Product product = createrProduct();
        product.dosometing();
    }
}
