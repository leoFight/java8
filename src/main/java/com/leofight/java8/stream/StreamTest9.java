package com.leofight.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class StreamTest9 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(5000000);

        for (int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        System.out.println("开始排序");

        long startTime = System.nanoTime();

        //list.stream().sorted().count();//串行流
        list.parallelStream().sorted().count();//并行流

        long endTime = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("排序耗时：" + millis);
    }
}
