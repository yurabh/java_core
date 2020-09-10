package lesson_137.localInnerClass;

import lesson_137.innerClassWithInterface.Destination;

public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {

            private String label;

            public PDestination(String label) {
                this.label = label;
            }

            @Override
            public String label() {
                return label;
            }
        }
        return new PDestination(s);
    }
}


class LocalDestinationTest {

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();

        Destination yura = p.destination("yura");

        yura.label();
    }
}