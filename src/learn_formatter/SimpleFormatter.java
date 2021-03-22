package learn_formatter;

import java.util.Formatter;

public class SimpleFormatter {
    public static void main(String[] args) {
        int x = 5;
        double y = 12.0;
        System.out.format("Row 1: [%d %f]\n", x, y);
        System.out.printf("Row 1: [%d %f]\n", x, y);

        Formatter f = new Formatter(System.out);
        char u = 'a';
        System.out.println("u = 'a'");
        f.format("s: %s\n", u);
        f.format("c: %c\n", u);
        f.format("h: %h\n", u);

        int v = 121;
        System.out.println("v = 121");
        f.format("d: %d\n", v);
        f.format("c: %c\n", u);
        f.format("b: %b\n", v);
        f.format("s: %s\n", v);
        f.format("x: %x\n", v);
    }
}
