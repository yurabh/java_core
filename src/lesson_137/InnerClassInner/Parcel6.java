package lesson_137.InnerClassInner;

public class Parcel6 {

    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                public TrackingSlip(String id) {
                    this.id = id;
                }

                String getSlip() {
                    return id;
                }
            }
            TrackingSlip tr = new TrackingSlip("hi");
            String s = tr.getSlip();
            System.out.println(s);
        }
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
