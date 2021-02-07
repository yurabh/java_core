package learn_inheritance_word_super_tostring_equal_hashcode_uml_diagram_enam_polymorphism;

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
