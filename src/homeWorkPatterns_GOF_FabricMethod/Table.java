package homeWorkPatterns_GOF_FabricMethod;

public class Table implements Creatable {

    private int countLegs;
    private int legДength;
    private int lengthOfthelid;
    private int widthOfthelid;
    private String colorTable;
    private String Glue;

    public void createProduction() {
        System.out.println("Створюем стіл");
    }

    public void cutTheWorkpiece(int countLegs, int legДength, int lengthOfthelid, int widthOfthelid) {
        this.countLegs = countLegs;
        this.legДength = legДength;
        this.lengthOfthelid = lengthOfthelid;
        this.widthOfthelid = widthOfthelid;
    }

    public void chopWorkpieces(String color) {
        this.colorTable = color;
    }

    public void Gluingachair(String Gluie) {
        this.Glue = Gluie;
    }

    public void show() {
        System.out.println("Вивід даних про Мебель");
        System.out.println("Кількість ніжок: " + countLegs);
        System.out.println("Вивід легкс: " + legДength);
        System.out.println("Вивід ленОфхелід: " + lengthOfthelid);
        System.out.println("Вивід ВідОфхеілд: " + widthOfthelid);
        System.out.println("Вивід колор табле: " + colorTable);
        System.out.println("Вивід клей: " + Glue);
    }
}
