package lesson_137.class_in_interface;

public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {

        @Override
        public void howdy() {
            System.out.println("hi");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
