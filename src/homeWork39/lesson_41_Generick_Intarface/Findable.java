package homeWork39.lesson_41_Generick_Intarface;

public interface Findable<T, V> {
    T find(V key);
}
