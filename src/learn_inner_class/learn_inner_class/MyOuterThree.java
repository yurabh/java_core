package learn_inner_class.learn_inner_class;

public class MyOuterThree {

    private String x = "Outer2";

    void doStuff() {

        String z = "local variable";

        class MyInner {
            public void seeOuter() {
                System.out.println("OuterThree x is " + x);
                System.out.println(": " + z);
            }
        }
        MyInner mi = new MyInner();
        mi.seeOuter();
    }

    public static void main(String[] args) {

        MyOuterThree myOuterThree = new MyOuterThree();

        myOuterThree.doStuff();
    }
}
