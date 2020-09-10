package lesson_137.anonimysClass;

public class Parcel8 {

    public Wrapping wraping(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }
}
