package learn_inner_class.learn_anonymous_inner_class;

class Horse extends Animal {
    void buck() {
    }
}

class Animal {
    void eat() {
        System.out.println("Eat something Animal");
    }
}

class Test {
    public static void main(String[] args) {
        Animal h = new Horse();
        h.eat();
//        h.buck();
    }
}
