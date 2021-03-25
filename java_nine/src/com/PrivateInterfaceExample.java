package com;

public class PrivateInterfaceExample implements CustomInterface {

    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args) {
        CustomInterface instance = new PrivateInterfaceExample();
        instance.method1();
        instance.method2();
        CustomInterface.method3();
    }
}
