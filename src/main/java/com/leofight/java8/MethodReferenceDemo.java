package com.leofight.java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "hello world");

        list.forEach(item -> System.out.println(item));

        System.out.println("-----------");

        list.forEach(System.out::println);//方法引用
    }
}
