package lesson_130.bruce_eckel_examples.reflaction;

import java.lang.reflect.*;
import java.util.regex.Pattern;

public class ShowMethods {
    private static String usage = "usage:\n" +
            "ShowMethods qualified.class.name\n" +
            "To show all methods in class or : \n" +
            "ShowMethods qualified.class.name word\n" +
            "To search for methods involving word";

    public ShowMethods() {
    }

    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        System.out.println(usage);

        int lines = 0;

        try {
            Class<?> c = Class.forName("lesson_130.bruce_eckel_examples.reflaction.ShowMethods");

            Method[] methods = c.getMethods();
            Constructor[] constructors = c.getConstructors();

            System.out.println("lOOP Methods");
            System.out.println();
            for (Method method : methods) {
                System.out.println("methods: " + p.matcher(method.toString()).replaceAll(""));
            }


            System.out.println("LOOP CONSTRUCTOR");
            System.out.println();
            for (Constructor constructor : constructors) {
                System.out.println("constructors: " + p.matcher(constructor.toString()).replaceAll(""));
                lines = methods.length + constructors.length;
            }

            System.out.println();
            System.out.println("lOOP MethodsTwo");
            for (Method method : methods) {
                System.out.println(method.toString());
                System.out.println(p.matcher(method.toString()));
                lines++;
            }

            System.out.println();
            System.out.println("LOOP CONSTRUCTORTWO");
            for (Constructor constructor : constructors) {
                System.out.println(constructor.toString());
                System.out.println(p.matcher(constructor.toString()));
                lines++;

            }

            String name = methods[0].getName();
            System.out.println(name);
            int i = methods[0].hashCode();
            System.out.println(i);
            Class<?> declaringClass = methods[0].getDeclaringClass();
            System.out.println(declaringClass);
            Object defaultValue = methods[0].getDefaultValue();
            System.out.println(defaultValue);

            Class<?>[] exceptionTypes = methods[0].getExceptionTypes();
            System.out.println(exceptionTypes);

            Type genericReturnType = methods[0].getGenericReturnType();
            System.out.println(genericReturnType);

            int modifiers = methods[0].getModifiers();
            System.out.println(modifiers);

            int parameterCount = methods[0].getParameterCount();

            System.out.println(parameterCount);

            Class<?> returnType = methods[0].getReturnType();

            System.out.println(returnType);

            TypeVariable<Method>[] typeParameters = methods[0].getTypeParameters();

            System.out.println(typeParameters.toString());

            boolean bridge = methods[0].isBridge();
            System.out.println(bridge);

            String s = constructors[0].toGenericString();

            System.out.println(s);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
