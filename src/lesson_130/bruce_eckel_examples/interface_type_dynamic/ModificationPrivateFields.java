package lesson_130.bruce_eckel_examples.interface_type_dynamic;

import java.lang.reflect.Field;

public class ModificationPrivateFields {

    public static void main(String[] args) throws Exception {
        WithPrivateFinalField pf = new WithPrivateFinalField();

        System.out.println(pf);

        Field f = pf.getClass().getDeclaredField("i");
        f.setAccessible(true);

        System.out.println("f.getInt: " + f.getInt(pf));

        f.setInt(pf, 12);

        System.out.println(pf);

        f = pf.getClass().getDeclaredField("s");

        f.setAccessible(true);


        System.out.println("f.getString : " + f.get(pf));

        f.setAccessible(true);

        f.set(pf, "goodDay");
        System.out.println("AFTER SET : " + pf);
    }
}
