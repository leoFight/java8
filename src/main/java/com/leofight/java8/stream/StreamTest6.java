package com.leofight.java8.stream;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Stream;

public class StreamTest6 {

    public static void main(String[] args) {
        /*Stream<String> stringStream = Stream.generate(UUID.randomUUID()::toString);
        stringStream.findFirst().ifPresent(System.out::println);*/

        Stream<Integer> stream = Stream.iterate(1, item -> item + 2).limit(6);
        //找出流中大于2的元素，然后将每个元素乘以2，然后忽略掉流中的前两个元素，然后再取流中的前两个元素，最后求出流中元素的和。
        //System.out.println(stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum());

        //找出流中大于2的元素，然后将每个元素乘以2，然后忽略掉流中的前两个元素，然后再取流中的前两个元素，最后求出流中元素最(大）小的元素
        //stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).max().ifPresent(System.out::println);

        //小结
        IntSummaryStatistics summaryStatistics = stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();

        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getSum());
    }
}
