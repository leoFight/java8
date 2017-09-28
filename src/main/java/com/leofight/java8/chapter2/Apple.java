package com.leofight.java8.chapter2;

import java.util.ArrayList;
import java.util.List;

public class Apple {

    private String color;

    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
    /*
        初试牛刀：筛选绿苹果
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> resultList = new ArrayList<Apple>();
        for (Apple apple : inventory){
            if ("green".equals(apple.getColor())){
                resultList.add(apple);
            }
        }

        return resultList;
    }
    /*
        再展身手：把颜色作为参数
     */
    public static List<Apple> filterApplesByColor(List<Apple> inventory,String color){
        List<Apple> resultList = new ArrayList<Apple>();
        for (Apple apple : inventory){
            if (apple.getColor().equals(color)){
                resultList.add(apple);
            }
        }

        return resultList;
    }

    /*
        再展身手：把重量作为参数
     */
    public static List<Apple> filterApplesByWeight(List<Apple> inventory,int weight){
        List<Apple> resultList = new ArrayList<Apple>();
        for (Apple apple : inventory){
            if (apple.getWeight() > weight){
                resultList.add(apple);
            }
        }

        return resultList;
    }

    /*
        第三次尝试：对你能想到的每个属性做筛选
     */
    public static List<Apple> filterApples(List<Apple> inventory,String color,int weight,boolean flag){
        List<Apple> resultList = new ArrayList<Apple>();
        for (Apple apple : inventory){
            if ((flag && apple.getWeight() > weight) || (!flag && apple.getColor().equals(color))){
                resultList.add(apple);
            }
        }

        return resultList;
    }
    /*
        修改为传入策略
     */
    public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate predicate){
        List<Apple> resultList = new ArrayList<Apple>();
        for (Apple apple : inventory){
            if (predicate.test(apple)){
                resultList.add(apple);
            }
        }

        return resultList;
    }

    /*
        以多种方式根据苹果生成一个String输出
     */
    public static void prettyPrintApple(List<Apple> inventory,AppleFormatter formatter){
        List<Apple> resultList = new ArrayList<Apple>();
        for (Apple apple : inventory){
            System.out.println(formatter.accept(apple));
        }
    }


}
