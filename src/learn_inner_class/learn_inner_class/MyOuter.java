package learn_inner_class.learn_inner_class;

public class MyOuter {

    private int x = 7;

    public void makeInner() {

        MyInnerTwo in = new MyInnerTwo();

        in.seeOuter();
    }

    class MyInnerTwo {
        private int a = 0;

        public void seeOuter() {
            System.out.println("Outer x is " + x);
        }
    }

    public static void main(String[] args) {

        MyOuter myOuter = new MyOuter();

        MyInnerTwo innerMy = myOuter.new MyInnerTwo();

        innerMy.seeOuter();

        MyInnerTwo myInnerTwo = new MyOuter().new MyInnerTwo();
    }
}
