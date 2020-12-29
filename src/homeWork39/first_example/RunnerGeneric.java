package homeWork39.first_example;

public class RunnerGeneric {

    public static void main(String[] args) {

        WorkGeneric<Integer> workWithGeneric = new IntegerNumbers();

        for (int i = 0; i < 4; i++) {
            workWithGeneric.addElement();
        }

        workWithGeneric.showInfo();
        workWithGeneric.removeElement();
        workWithGeneric.showInfo();
        workWithGeneric.insertIntoSort();
        workWithGeneric.showInfo();

        WorkGeneric<Double> workGenericAnother = new DoubleNumbers();

        for (int i = 0; i < 4; i++) {
            workGenericAnother.addElement();
        }

        workGenericAnother.showInfo();
        workGenericAnother.removeElement();
        workGenericAnother.showInfo();
        workGenericAnother.insertIntoSort();
        workGenericAnother.findElement();
    }
}
