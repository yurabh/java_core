package learn_inheritance_word_super_toString_equal_hashCode_umlDiagram_enam_polymorphism;

public enum Color {

    yellow("wovtuy"), green("Selenuy"), red("Cervonuy");
    String name;

    Color(String name) {
        this.name = name;
    }

    public String getNameColor() {
        return name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }
}
