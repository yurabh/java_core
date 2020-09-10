package lesson_137.innerClassWithInterface;

public class Parcel4 {

    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        public PDestination(String label) {
            this.label = label;
        }

        @Override
        public String label() {
            return label;
        }
    }


    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}


class TestParcel {
    public static void main(String[] args) {
        Parcel4 parcel = new Parcel4();

        Destination d = parcel.destination("Hi how are you");

        Contents contents = parcel.contents();

        contents.value();

        d.label();

        Parcel4.PDestination ds = parcel.new PDestination("dss");
    }
}
