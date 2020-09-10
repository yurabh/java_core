package homeWorkPatterns_Information_Expert.Serialisacija;

import java.io.*;

public class Serializator {

    public static void saveData(String path, Object object) {
        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream objectStream = new ObjectOutputStream(file);
            objectStream.writeObject(object);
            objectStream.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object loadData(String path) {
        Object tmpObject = null;
        try {
            FileInputStream file = new FileInputStream(path);
            ObjectInputStream objectStream = new ObjectInputStream(file);
            tmpObject = objectStream.readObject();
            objectStream.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tmpObject;
    }
}
