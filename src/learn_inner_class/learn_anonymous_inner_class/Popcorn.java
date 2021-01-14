package learn_inner_class.learn_anonymous_inner_class;

class Popcorn {
    public void pop() {
        System.out.println("popcorn");
    }
}

class Food {
    Popcorn popcorn = new Popcorn() {
        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };

    public static void main(String[] args) {
        Food food = new Food();

        food.popcorn.pop();
    }
}
