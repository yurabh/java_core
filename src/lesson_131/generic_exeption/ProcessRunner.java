package lesson_131.generic_exeption;

import java.util.*;

public class ProcessRunner<T, E extends Exception> extends ArrayList<Processor<T, E>> {
    List<T> proccessAll() throws E {
        List<T> resultCollector = new ArrayList<T>();
        for (Processor<T, E> processor : this) {
            processor.process(resultCollector);
        }
        return resultCollector;
    }
}
