package learn_reflection.seventh_example;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.net.URL;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {

        Person person = new Person();

        Class<?> reflection = Person.class;

        System.out.println("is value type or not:  " + reflection.isPrimitive());

        System.out.println("is object: " + reflection.isInstance(person));

        System.out.println("is anonymous or not: " + reflection.isAnonymousClass());

        System.out.println("getSimpleName: " + reflection.getSimpleName());

        System.out.println("CanonicalName: " + reflection.getCanonicalName());

        System.out.println("getName: " + reflection.getName());

        System.out.println("isInterface: " + reflection.isInterface() + "\n\n");


        final Class<?>[] interfaces = reflection.getInterfaces();

        for (Class<?> i : interfaces) {
            System.out.println(i.toString());
        }


        final Class<?> superclass = reflection.getSuperclass();

        System.out.println(superclass.getName());

        final String typeName = reflection.getTypeName();

        System.out.println(typeName);

        System.out.println(reflection.isAnnotation());

        final String s = reflection.toGenericString();

        System.out.println(s);


        final boolean instance = reflection.isInstance(person);

        System.out.println(instance);


        final boolean synthetic = reflection.isSynthetic();

        System.out.println(synthetic);


        final boolean memberClass = reflection.isMemberClass();

        System.out.println(memberClass);


        final boolean localClass = reflection.isLocalClass();

        System.out.println(localClass);


        final boolean anEnum = reflection.isEnum();

        System.out.println(anEnum);

        final boolean array = reflection.isArray();

        System.out.println(array);


        final URL resource = reflection.getResource("learn_reflection.seventh_example" +
                ".Person");

        System.out.println(resource);

        final String packageName = reflection.getPackageName();

        System.out.println(packageName);

        final Class<? extends Person> aClass = reflection.asSubclass(Person.class);


        try {
            Constructor<?> constructorOne = reflection.getConstructor();

            System.out.println(constructorOne.getName());
            System.out.println(constructorOne.isAccessible());
            System.out.println(constructorOne.toGenericString());
            System.out.println(constructorOne.getParameterCount());
            System.out.println(constructorOne.isSynthetic());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        Constructor[] constructor = reflection.getConstructors();

        for (int i = 0; i < constructor.length; i++) {

            System.out.println(constructor[i].toString());

            String toGenericString = constructor[i].toGenericString();

            System.out.println("toGenericString: " + toGenericString);


            Class declaringClass = constructor[i].getDeclaringClass();

            System.out.println("getDeclaringClass(): " + declaringClass);

            int modifiers = constructor[i].getModifiers();

            System.out.println(modifiers);


            String name = constructor[i].getName();

            System.out.println("nameConstructor: " + name);

            int parameterCount = constructor[i].getParameterCount();

            System.out.println("count parameters constructor : " + parameterCount);


            TypeVariable[] typeParameters = constructor[i].getTypeParameters();

            for (int j = 0; j < typeParameters.length; j++) {
                System.out.println("typeParameters: " + typeParameters[j].getTypeName());
            }

            int hashCode = constructor[i].hashCode();

            System.out.println("constructorHashCode: " + hashCode);

            Class[] parameterTypes = constructor[i].getParameterTypes();

            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.println("getParameterTypes(): " + parameterTypes[j].getSimpleName());
                System.out.println(parameterTypes[j].getPackageName());
                System.out.println(parameterTypes[j].isPrimitive());
            }


            Parameter[] parameters = constructor[i].getParameters();
            for (int j = 0; j < parameters.length; j++) {
                System.out.println("getParameters().isNamePresent()"
                        + parameters[j].isNamePresent());

                System.out.println("getParameterType().getTypeName()"
                        + parameters[j].getParameterizedType().getTypeName());

                final boolean implicit = parameters[j].isImplicit();

                System.out.println(implicit);
            }

            try {
                Object object = constructor[1].newInstance();
                System.out.println("newInstance: " + object);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }


            boolean varArgs = constructor[i].isVarArgs();

            System.out.println("isArgs: " + varArgs);

            final Class[] exceptionTypes = constructor[i].getExceptionTypes();

            for (int j = 0; j < exceptionTypes.length; j++) {
                System.out.println(exceptionTypes[j].toGenericString());
            }
        }


        Person personTwo = new Person();

        final Class<? extends Person> aClassOne = personTwo.getClass();

        try {
            final Field field = aClassOne.getField("age");

            System.out.println("age: " + field);


            try {
                field.setAccessible(true);
                field.set(personTwo, 12);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


            try {
                field.setAccessible(true);
                final Object o = field.get(personTwo);
                System.out.println(o.toString());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


            final boolean accessible = field.isAccessible();

            System.out.println(accessible);

            final boolean b = field.canAccess(personTwo);
            System.out.println(b);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


        try {
            final Field fieldDeclares = aClassOne.getDeclaredField("year");

            final boolean accessField = fieldDeclares.canAccess(personTwo);

            System.out.println(accessField);

            fieldDeclares.setAccessible(true);

            fieldDeclares.set(personTwo, 12);

            fieldDeclares.setAccessible(true);

            final Object o = fieldDeclares.get(personTwo);

            System.out.println(o);


        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Person personMethod = new Person();

        try {
            final Class<?> methodReflection = Class.forName("learn_reflection.seventh_example.Person");

            final Method method = methodReflection.getDeclaredMethod("setName", String.class);

            method.setAccessible(true);

            final Object invoke = method.invoke(personMethod, "Mawa");

            System.out.println("toString: " + method.toString());

            System.out.println("name: " + method.getName());

            System.out.println("parameterCount: " + method.getParameterCount());

            System.out.println("returnType" + method.getReturnType());

            System.out.println("isBridge: " + method.isBridge());

            System.out.println("toGenericString: " + method.toGenericString());

            final Object defaultValue = method.getDefaultValue();

            System.out.println("defaultValue: " + defaultValue);

            System.out.println("isDefault: " + method.isDefault());

            final Parameter[] parameters = method.getParameters();

            for (int i = 0; i < parameters.length; i++) {

                System.out.println(parameters[i].getType());

                System.out.println(parameters[i].isImplicit());

                System.out.println(parameters[i].isNamePresent());
            }

            final Type genericReturnType = method.getGenericReturnType();

            final String typeNameOne = genericReturnType.getTypeName();

            System.out.println(typeNameOne);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        final Class<Person> personClass = Person.class;

        final Package aPackage = personClass.getPackage();

        System.out.println("package: " + aPackage.toString());

        System.out.println("name: " + aPackage.getName());

        System.out.println("impl Title: " + aPackage.getImplementationTitle());

        System.out.println("implVendor: " + aPackage.getImplementationVendor());

        System.out.println("specific vendor: " + aPackage.getSpecificationTitle());

        System.out.println("implVendor: " + aPackage.getImplementationVersion());

        System.out.println("isSealed: " + aPackage.isSealed());

        final Module module = personClass.getModule();

        System.out.println(module.getName());

        final Set<String> packages = module.getPackages();

        for (String pack : packages) {
            System.out.println(pack);
        }


        final Class<Person> personClassTwo = Person.class;

        try {
            final Method reflectionMethod = personClassTwo.getDeclaredMethod("getAge");

            final PersonAnnotation annotation = reflectionMethod.getDeclaredAnnotation(PersonAnnotation.class);

            System.out.println("age: " + annotation.age());

            final Annotation[] annotations = reflectionMethod.getAnnotations();

            for (int i = 0; i < annotations.length; i++) {

                final Annotation annotationAnotherExample = annotations[i];

                if (annotationAnotherExample instanceof PersonAnnotation) {

                    PersonAnnotation personAnnotation = (PersonAnnotation) annotationAnotherExample;

                    System.out.println("name: " + personAnnotation.age());
                }
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
