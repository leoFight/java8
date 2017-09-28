package com.leofight.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Lambda及Stream使用
 */
public class Test4 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "hello world");
        //使用Lambda表达式来操作集合把每个元素转换成大写。
        list.forEach(item -> System.out.println(item.toUpperCase()));

        //将转换成大写的元素放入新的list中
        List<String> list2 = new ArrayList<>();
        /*
        list.forEach(item -> list2.add(item.toUpperCase()));
        list2.forEach(item -> System.out.println(item));
        */

        //Stream实现上述代码
        //list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));

        //方法引用实现上述代码
        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));

        Function<String,String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);
    }
}
