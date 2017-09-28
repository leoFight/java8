package com.leofight.java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("hello", "world", "helloworld");

        //String[] stringArray = stringStream.toArray(length -> new String[length]);
        //String[] stringArray = stringStream.toArray(String[]::new);

        //Arrays.asList(stringArray).forEach(System.out::println);

        //比较难理解，重点理解
        //List<String> list = stringStream.collect(Collectors.toList());
        //List<String> list = stringStream.collect(() -> new ArrayList(), (theList, item) -> theList.add(item), (theList1, theList2) -> theList1.addAll(theList2));
        //List<String> list = stringStream.collect(LinkedList::new,LinkedList::add,LinkedList::addAll);
        //list.forEach(System.out::println);


        //List<String> list = stringStream.collect(Collectors.toCollection(ArrayList::new));
        //list.forEach(System.out::println);

        /*Set<String> set = stringStream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set.getClass());
        set.forEach(System.out::println);*/

        String str = stringStream.collect(Collectors.joining());
        System.out.println(str);
    }
}
