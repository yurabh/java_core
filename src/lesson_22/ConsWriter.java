package lesson_22;

public class ConsWriter implements IWrite {
    @Override
    public void writeInformation(String line) {
        System.out.println("yura:" + line);
    }
}
