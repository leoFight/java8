package com.leofight.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> persons = Arrays.asList(person1, person2, person3);

        PersonTest test = new PersonTest();

        List<Person> peopleResult = test.getPersonByUsername("zhangsan", persons);
        peopleResult.forEach(person -> System.out.println(person.getUsername()));

        System.out.println("----------");

        List<Person> peopleResult2 = test.getPersonsByAge(20, persons);
        peopleResult2.forEach(person -> System.out.println(person.getAge()));

        System.out.println("------------");

        List<Person> personResult3 = test.getPersonsByAge(20, persons, (age, personList) -> {
            return personList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
        });
        personResult3.forEach(person -> System.out.println(person.getAge()));

        System.out.println("------------");

        List<Person> personResult4 = test.getPersonsByAge(20, persons, (age, personList) -> {
            return personList.stream().filter(person -> person.getAge() <= age).collect(Collectors.toList());
        });
        personResult4.forEach(person -> System.out.println(person.getAge()));


    }

    public List<Person> getPersonByUsername(String username, List<Person> persons) {
        return persons.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonsByAge(int age, List<Person> persons) {

        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personList) -> {
            return personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());
        };

        return biFunction.apply(age, persons);
    }

    public List<Person> getPersonsByAge(int age, List<Person> peoples, BiFunction<Integer, List<Person>, List<Person>> biFunction) {

        return biFunction.apply(age, peoples);
    }
}
