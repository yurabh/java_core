package learn_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ThirdExample {

    public static void main(String[] args) throws IOException {
        final List<String> strings = Files.readAllLines(Paths.get("src/learn_nio/read_example.txt"));

        strings.forEach(System.out::println);

        Files.write(Paths.get("src/learn_nio/write_example.txt"), strings);
    }
}
