package lesson_107;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionThreads {

    public static void main(String[] args) {
        Collection names = Collections.synchronizedCollection(new ArrayList());
        //names
    }
}
