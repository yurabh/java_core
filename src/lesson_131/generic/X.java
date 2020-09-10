package lesson_131.generic;

public class X implements Comparable<X> {
    static final int Size = 100;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        gia = (Generic<Integer>[]) new Object[Size];

        gia = (Generic<Integer>[]) new Generic[100];
        System.out.println(gia.getClass().getSimpleName());

        gia[0] = new Generic<>();
    }

    @Override
    public int compareTo(X o) {
        return o.compareTo(o);
    }
}
