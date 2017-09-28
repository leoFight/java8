package com.leofight.java8;

import java.util.function.Function;

public class FunctionTest2 {

    public static void main(String[] args) {

        FunctionTest2 test2 = new FunctionTest2();

        System.out.println(test2.compute(2, value -> value * 3 ,value -> value * value));//12 function2 === before函数
        System.out.println(test2.compute2(2, value -> value * 3 ,value -> value * value));//36 function2 ===after函数
    }

    public int compute(int a, Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return  function1.compose(function2).apply(a);
    }
    public int compute2(int a, Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return  function1.andThen(function2).apply(a);
    }



}
