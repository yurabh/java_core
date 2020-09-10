package lesson_131.generic_exeption;

import java.util.List;

public interface Processor<T, E extends Exception> {
    void process(List<T> resultCollector) throws E;
}
