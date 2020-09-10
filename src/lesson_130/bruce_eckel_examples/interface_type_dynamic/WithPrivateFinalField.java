package lesson_130.bruce_eckel_examples.interface_type_dynamic;

public class WithPrivateFinalField {

    public WithPrivateFinalField() {
    }

    private int i = 1;
    private final String s = "I,m totally safe";
    private String s2 = "Am I safe ?";

    @Override
    public String toString() {
        return "WithPrivateFinalField{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
}
