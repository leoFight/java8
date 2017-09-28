package com.leofight.java8.chapter2;

import java.util.Arrays;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {
        Apple apple1 = new Apple("red",500);
        Apple apple2 = new Apple("green",100);
        Apple apple3 = new Apple("yellow",300);

        List<Apple> list = Arrays.asList(apple1,apple2,apple3);
        //查找绿苹果
        System.out.println(Apple.filterGreenApples(list));
        System.out.println("---------");
        //根据传入的颜色查找不同颜色的苹果
        System.out.println(Apple.filterApplesByColor(list,"red"));
        System.out.println(Apple.filterApplesByColor(list,"green"));
        System.out.println("---------");
        //根据传入的重量查询不同重量的苹果
        System.out.println(Apple.filterApplesByWeight(list,150));
        System.out.println("---------");
        //根据需要的属性筛选
        System.out.println(Apple.filterApples(list,"red",0,false));
        System.out.println("---------");
        //使用策略模式筛选
        System.out.println(Apple.filterApples(list,new AppleGreenColorPredicate()));
        System.out.println("--------");
        //使用策略模式打印苹果
        Apple.prettyPrintApple(list,new AppleFancyFormatter());
        Apple.prettyPrintApple(list,new AppleSimpleFormatter());
        System.out.println("---------");
        //使用匿名类的策略
        System.out.println(Apple.filterApples(list, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        }));
        System.out.println("-----------");
        //使用Lambda表达式
        System.out.println(Apple.filterApples(list,apple -> apple.getWeight() > 300));
    }

}
