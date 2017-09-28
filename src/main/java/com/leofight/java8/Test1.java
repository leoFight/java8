package com.leofight.java8;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------------");

        //增强for循环
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("-----------");

        //java8 lambda表达式
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println("-----------");

        //等同上面list.forEach()方法。
        list.forEach(integer -> System.out.println(integer));

        System.out.println("--------");
        //method reference
        list.forEach(System.out::println);

    }
}
