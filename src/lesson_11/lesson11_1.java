package lesson_11;

public class lesson11_1 {
    public static void main(String[] args) {
        System.out.println(sub(5));
    }


    public static int sub(int n) {
        int result;
        if (n == 1) return 1;
        result = sub(n - 1) * n;
        return result;
    }
}
