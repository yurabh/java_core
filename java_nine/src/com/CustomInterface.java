package com;

public interface CustomInterface {
    void method1();

    default void method2() {
        method4();
        method5();
        System.out.println("default method");
    }

    static void method3() {
        method5();
        System.out.println("static method");
    }

    private void method4() {
        System.out.println("private method");
    }

    private static void method5() {
        System.out.println("private static method");
    }
}
