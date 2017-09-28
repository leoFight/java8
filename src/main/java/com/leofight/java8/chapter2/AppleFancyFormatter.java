package com.leofight.java8.chapter2;

public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accept(Apple a) {
        String characteristic = a.getWeight() > 150 ? "heavy" : "light";

        return "A "+ characteristic+" "+ a.getColor()+ " apple";
    }
}
