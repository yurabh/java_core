package learn_inner_class.learn_anonymous_inner_class;

public class PopcornTwo {
    public void pop() {
        System.out.println("popcorn");
    }
}

class FoodTwo {

    PopcornTwo p = new PopcornTwo() {
        public void sizzle() {
            System.out.println("anonymous sizzling popcorn");
        }

        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };

    public void popIt() {
        p.pop();
//        p.sizzle();
    }
}
