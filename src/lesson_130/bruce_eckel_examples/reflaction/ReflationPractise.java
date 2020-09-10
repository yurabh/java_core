package lesson_130.bruce_eckel_examples.reflaction;

import java.lang.reflect.*;
import java.util.Objects;

public class ReflationPractise {

    private final int year = 2012;

    public int age;

    public String name = "yura";

    public double price;

    public ReflationPractise() {
    }

    public ReflationPractise(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReflationPractise reflationPractise = (ReflationPractise) o;
        return year == reflationPractise.year &&
                age == reflationPractise.age &&
                Double.compare(reflationPractise.price, price) == 0 &&
                Objects.equals(name, reflationPractise.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, age, name, price);
    }

    @Override
    public String toString() {
        return "ReflationPractise{" +
                "year=" + year +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        ReflationPractise reflationPractiseOb = new ReflationPractise();

        Class<?> reflation = ReflationPractise.class;

        System.out.println("Чи примітивний тип:  " + reflation.isPrimitive());

        System.out.println("Чи Обєкт:  " + reflation.isInstance(reflationPractiseOb));

        System.out.println("Чи анонімний клас: " + reflation.isAnonymousClass());

        System.out.println("GetSimpleName: " + reflation.getSimpleName());

        System.out.println("CannonicalName :" + reflation.getCanonicalName());

        System.out.println("getName() : " + reflation.getName());

        System.out.println("isInterface: " + reflation.isInterface());

        System.out.println("Constructors");

        System.out.println();

        Constructor[] constructor = reflation.getConstructors();
        for (int i = 0; i < constructor.length; i++) {

            System.out.println(constructor[i]);
            String s = constructor[i].toGenericString();
            System.out.println("toGenericString: " + s);


            Class declaringClass = constructor[i].getDeclaringClass();
            System.out.println("getDeclaringClass(): " + declaringClass);

            int modifiers = constructor[i].getModifiers();

            String name = constructor[i].getName();
            System.out.println("NameConstructor: " + name);

            int parameterCount = constructor[i].getParameterCount();

            System.out.println("count parameters constructor : " + parameterCount);

            TypeVariable[] typeParameters = constructor[i].getTypeParameters();

            for (int j = 0; j < typeParameters.length; j++) {
                System.out.println("typeParameters: " + typeParameters[j].getTypeName());
            }

            int i1 = constructor[i].hashCode();
            System.out.println("constructorHashCode: " + i1);

            Class[] parameterTypes = constructor[i].getParameterTypes();

            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.println("getParameterTypes(): " + parameterTypes[j].getSimpleName());
            }

            Parameter[] parameters = constructor[i].getParameters();
            for (int j = 0; j < parameters.length; j++) {
                System.out.println("getParameters().isNamePresent()" + parameters[j].isNamePresent());
                System.out.println("getParameterazedType().getTypeName()" + parameters[j].getParameterizedType().getTypeName());
            }

//            try {
//                Object object = constructor[i].newInstance();
//                System.out.println("newInstance" + object);
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            }

            boolean varArgs = constructor[i].isVarArgs();

            System.out.println("isVargs: " + varArgs);
        }


        try {
            Constructor<?> constructorOne = reflation.getConstructor();
            constructorOne.getName();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        System.out.println("getSuperClass: " + reflation.getSuperclass());

        try {
            Field field = reflation.getField("age");
            System.out.println(field.getName());

            Object object = field.getType();

            ReflationPractise reflationPractiseNew = new ReflationPractise();

            try {
                Object object1 = field.get(reflationPractiseNew);

                field.set(reflationPractiseNew, object1);

                System.out.println(reflationPractiseNew.age + "     " + reflationPractiseNew.year + "       " + reflationPractiseNew.price + "  " +
                        "     " + reflationPractiseNew.name);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            System.out.println(object);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
