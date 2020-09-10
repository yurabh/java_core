package lesson_137;

public class Parcel {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        public Destination(String label) {
            this.label = label;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String description) {
        Contents contents = new Contents();

        Destination destination = new Destination(description);

        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel();

        parcel.ship("hi");

        Parcel.Contents refParcelContents = parcel.contents();

        refParcelContents.value();

        System.out.println(refParcelContents.i);

        Parcel.Destination referParcelDestination = parcel.to("Hi how are you");

        System.out.println(referParcelDestination.readLabel());
    }
}
