package com.leofight.java8.stream;

import java.util.stream.IntStream;

public class StreamTest8 {

    public static void main(String[] args) {
        //注意使用顺序，防止无限流，distinct放在limit前会出現无限流。
        IntStream.iterate(0, i -> (i + 1) % 2).limit(6).distinct().forEach(System.out::println);
    }
}
