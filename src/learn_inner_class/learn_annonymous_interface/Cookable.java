package learn_inner_class.learn_annonymous_interface;

public interface Cookable {
    public void cook();
}

class FoodThree {

    protected Cookable c = new Cookable() {
        @Override
        public void cook() {
            System.out.println("anonymous cookable implementer");
        }
    };
}

class TestTwo {

    public static void main(String[] args) {
        FoodThree foodThree = new FoodThree();
        foodThree.c.cook();
    }
}
