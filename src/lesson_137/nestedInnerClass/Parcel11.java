package lesson_137.nestedInnerClass;

import lesson_137.innerClassWithInterface.Contents;
import lesson_137.innerClassWithInterface.Destination;

public class Parcel11 {

    private static class ParcelContents implements Contents {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination {

        private String label;

        private ParcelDestination(String label) {
            this.label = label;
        }

        @Override
        public String label() {
            return label;
        }


        public static void f() {
        }

        static int x = 10;


        static class AnotherLevel {
            public static void f() {
            }
            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();

        System.out.println(c.value());

        Destination d = destination("Transaction");

        System.out.println(d.label());
    }
}
