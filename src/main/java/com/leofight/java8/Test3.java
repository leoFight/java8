package com.leofight.java8;

public class Test3 {

    public static void main(String[] args) {

        TheInterface i1 = () -> {
        };
        //interface com.leofight.java8.TheInterface
        System.out.println(i1.getClass().getInterfaces()[0]);

        TheInterface2 i2 = () -> {
        };
        //interface com.leofight.java8.TheInterface2
        System.out.println(i2.getClass().getInterfaces()[0]);

        new Thread(() -> {
            System.out.println("hello world");
        }).start();
    }
}

@FunctionalInterface
interface TheInterface {
    void myMethod();
}

@FunctionalInterface
interface TheInterface2 {
    void myMethod2();
}
