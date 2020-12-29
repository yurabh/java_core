package learn_main_system_design_uml_diagram;

public enum ColorWall {

    green("selenuy"), red("cervonuy"), blue("suniy");

    private String colorWall;

    ColorWall(String colorWall) {
        this.colorWall = colorWall;
    }

    public String getColorWall() {
        return this.colorWall;
    }
}
