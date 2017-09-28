package com.leofight.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest {

    public static void main(String[] args) {
        BiFunctionTest biFunctionTest = new BiFunctionTest();

        System.out.println(biFunctionTest.compute(1, 2, (value1, value2) -> value1 + value2));
        System.out.println(biFunctionTest.compute(1, 2, (value1, value2) -> value1 - value2));
        System.out.println(biFunctionTest.compute(1, 2, (value1, value2) -> value1 * value2));
        System.out.println(biFunctionTest.compute(1, 2, (value1, value2) -> value1 / value2));


        System.out.println(biFunctionTest.compute(2, 3, (value1, value2) -> value1 + value2, value3 -> value3 * value3));//25

    }

    public int compute(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public int compute(int a, int b, BiFunction<Integer, Integer, Integer> biFunction1, Function<Integer, Integer> function2) {
        return biFunction1.andThen(function2).apply(a, b);
    }
}
