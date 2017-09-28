package com.leofight.java8;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        //Optional<String> optional = Optional.of("hello");
        Optional<String> optional = Optional.empty();

        //不推荐
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        System.out.println("-----------------");

        optional.ifPresent(item -> System.out.println(item));//推荐的Option使用方式

        System.out.println("--------");

        System.out.println(optional.orElse("world"));

        System.out.println("---------");

        System.out.println(optional.orElseGet(() -> "nihao"));
    }
}
