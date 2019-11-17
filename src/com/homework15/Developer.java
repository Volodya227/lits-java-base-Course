package com.homework15;

import java.util.Objects;

public class Developer implements Comparable<Object> {
    int age;
    String name;

    Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Developer(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return age == developer.age && Objects.equals(name, developer.name);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
