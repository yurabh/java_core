package lesson_131.generic_exeption;

import java.util.List;

public class Processor1 implements
        Processor<String, Failure1> {
    static int count = 3;

    @Override
    public void process(List<String> resultCollector) throws Failure1 {
        if (count-- > 1) {
            resultCollector.add("Hep");
        } else {
            resultCollector.add("Ho");
        }
        if (count < 0) {
            throw new Failure1();
        }
    }
}
