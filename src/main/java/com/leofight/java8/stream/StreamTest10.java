package com.leofight.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest10 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

        //list.stream().mapToInt(item -> item.length()).filter(item -> item == 5).findFirst().ifPresent(System.out::println);

        //正确理解流的操作。输出结果为 hello 5
        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
    }
}
