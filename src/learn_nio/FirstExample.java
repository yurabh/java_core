package learn_nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FirstExample {

    public static void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println("Root is: " + path.getRoot());
        Path currentParent = path;
        while ((currentParent = currentParent.getParent()) != null) {
            System.out.println(" Current parent is: " + currentParent);
        }
    }

    public static void main(String[] args)
            throws IOException {
        Paths.get("pandas", "cuddly.png");
        FileSystems.getDefault().getPath("pandas/cuddly.png");
        FileSystems.getDefault().getPath("c:", "zooInfo", "November", "employees.txt");


        Paths.get("/zoo/../home").getParent().normalize().toAbsolutePath();
        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: " + path);
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println(" Element " + i + " is: " + path.getName(i));
        }

        printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
        System.out.println();
        printPathInformation(Paths.get("armadillo/shells.txt"));

        Path path10 = Paths.get("C:\\birds\\egret.txt");
        System.out.println("Path1 is Absolute? " + path10.isAbsolute());
        System.out.println("Absolute Path1: " + path10.toAbsolutePath());

        Paths.get("/mammal/carnivore/raccoon.image");
        System.out.println("Path is: " + path);
        System.out.println("SubPath from 0 to 3 is: " + path.subpath(0, 3));

        Path path15 = Paths.get("/ostrich/feathers.png");
        Files.exists(path15);

        System.out.println(Files.isSameFile(Paths.get("/user/home/cobra"),
                Paths.get("/user/home/snake")));

        Files.createDirectory(Paths.get("/bison/field"));
        Files.createDirectories(Paths.get("/bison/field/pasture/green"));

        Files.copy(Paths.get("/panda"), Paths.get("/panda-save"));
        Files.copy(Paths.get("/panda/bamboo.txt"), Paths.get("/panda-save/bamboo.txt"));

        Path path16 = Paths.get("/fish/sharks.log");

        final List<String> lines = Files.readAllLines(path16);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
