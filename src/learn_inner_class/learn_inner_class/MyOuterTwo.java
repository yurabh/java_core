package learn_inner_class.learn_inner_class;

public class MyOuterTwo {

    private int x = 7;

    public void makeInner() {
        MyInnerTwo in = new MyInnerTwo();
        in.seeOuter();
    }

    private class MyInnerTwo {
        public void seeOuter() {
            System.out.println("Outer x is " + x);
            System.out.println("Inner class ref is " + this);
            System.out.println("Outer class ref is " + MyOuterTwo.this);
        }
    }

    public static void main(String[] args) {
        MyOuterTwo.MyInnerTwo inner = new MyOuterTwo().new MyInnerTwo();
        inner.seeOuter();
    }
}
