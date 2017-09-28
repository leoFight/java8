package com.leofight.java8;


import java.util.function.Supplier;

public class StudentTest {
    public static void main(String[] args) {

        Supplier<Student> supplier = () -> new Student();

        System.out.println(supplier.get().getName());
        System.out.println(supplier.get().getAge());

        System.out.println("------------------");

        Supplier<Student> supplier2 = Student::new;

        System.out.println(supplier2.get().getName());
        System.out.println(supplier2.get().getAge());

        System.out.println("------------------");
    }
}
