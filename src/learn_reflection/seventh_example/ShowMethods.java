package learn_reflection.seventh_example;

import java.lang.reflect.*;
import java.util.regex.Pattern;

public class ShowMethods {

    private static String usage = "usage:\n" +
            "ShowMethods qualified.class.name\n" +
            "To show all methods in class or : \n" +
            "ShowMethods qualified.class.name word\n" +
            "To search for methods involving word";

    private static Pattern p = Pattern.compile("\\w+\\.");

    public ShowMethods() {
    }

    public static void main(String[] args) {

        System.out.println(usage);

        int lines = 0;

        try {
            Class<?> c = Class.forName("learn_reflection.seventh_example.ShowMethods");

            Method[] methods = c.getMethods();

            Constructor[] constructors = c.getConstructors();

            for (Method method : methods) {
                System.out.println("methods: " + p.matcher(method.toString()).replaceAll("") + "\n\n");
            }


            for (Constructor constructor : constructors) {
                System.out.println("constructors: " + p.matcher(constructor.toString())
                        .replaceAll("") + "\n\n");
                lines = methods.length + constructors.length;

            }


            for (Method method : methods) {
                System.out.println("methods: " + method.toString() + "\n");
                System.out.println("methods regex: " + p.matcher(method.toString()) + "\n");
                lines++;
            }


            for (Constructor constructor : constructors) {
                System.out.println("constructor: " + constructor.toString() + "\n");
                System.out.println("constructor: " + p.matcher(constructor.toString()) + "\n");
                lines++;
            }


            System.out.println("count methods + constructors: " + lines);

            String name = methods[0].getName();

            System.out.println("name method one: " + name);

            int i = methods[0].hashCode();

            System.out.println("hash code method one: " + i);


            Class<?> declaringClass = methods[0].getDeclaringClass();

            System.out.println(declaringClass);

            Object defaultValue = methods[0].getDefaultValue();

            System.out.println(defaultValue);


            Class<?>[] exceptionTypes = methods[0].getExceptionTypes();

            for (int j = 0; j < exceptionTypes.length; j++) {
                System.out.println(exceptionTypes[j]);
            }

            Type genericReturnType = methods[0].getGenericReturnType();

            System.out.println(genericReturnType);

            int modifiers = methods[0].getModifiers();

            System.out.println(modifiers);

            int parameterCount = methods[0].getParameterCount();

            System.out.println(parameterCount);

            Class<?> returnType = methods[0].getReturnType();

            System.out.println(returnType);

            boolean bridge = methods[0].isBridge();

            System.out.println(bridge);

            String s = constructors[0].toGenericString();

            System.out.println(s);

        } catch (
                ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
