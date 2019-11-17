package com.homework15;


public class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
