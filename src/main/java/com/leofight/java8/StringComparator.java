package com.leofight.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("zhangsan","lisi","wangwu","zhangliu");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(names);

        System.out.println("-------------------");

        Collections.sort(names,(String o1,String o2) -> {
            return o2.compareTo(o1);
        });

        System.out.println(names);

        System.out.println("--------------------");

        Collections.sort(names,Collections.reverseOrder());

        System.out.println(names);

        System.out.println("-----------");

        Collections.sort(names,(o1,o2) -> o2.compareTo(o1));

        System.out.println(names);
    }
}
