package homeWorkPatterns_GOF_FabricMethod;

public class Chair implements Creatable {

    private int countLegs;
    private int legДength;
    private int lengthOfthelid;
    private int widthOfthelid;
    private String colorChair;
    private String Glue;

    public void createProduction() {
        System.out.println("Створюем стілець");
    }

    public void cutTheWorkpiece(int countLegs1, int legtength1, int lengthOfthelid1, int widthOfthelid1) {
        this.countLegs = countLegs1;
        this.legДength = legtength1;
        this.lengthOfthelid = lengthOfthelid1;
        this.widthOfthelid = widthOfthelid1;
    }

    public void chopWorkpieces(String color) {
        this.colorChair = color;
    }

    public void Gluingachair(String Gluie) {
        this.Glue = Gluie;
    }

    public void show() {
        System.out.println("Вивід даних про Мебль");
        System.out.println("Кількість ніжок: " + countLegs);
        System.out.println("Вивід легкс: " + legДength);
        System.out.println("Вивід ленОфхелід: " + lengthOfthelid);
        System.out.println("Вивід ВідОфхеілд: " + widthOfthelid);
        System.out.println("Вивід колор табле: " + colorChair);
        System.out.println("Вивід клей: " + Glue);
    }
}
