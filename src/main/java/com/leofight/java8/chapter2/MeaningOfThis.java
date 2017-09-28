package com.leofight.java8.chapter2;

/**
 * 下面代码执行时会有什么样的输出呢？ 4、5、6还是42？
 * 答案：5 因为this指的是包含它的Runnable,而不是外面的类MeaningOfThis
 */
public class MeaningOfThis {
    public final int value = 4;

    public void doIt() {
        int value = 6;
        Runnable runnable = new Runnable() {
            public final int value = 5;

            @Override
            public void run() {
                int vlaue = 10;
                System.out.println(this.value);
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {
        MeaningOfThis meaningOfThis = new MeaningOfThis();
        meaningOfThis.doIt();
    }
}
