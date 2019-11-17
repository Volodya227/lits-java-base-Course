package com.homework15;

import java.util.Objects;

public class Recruiter implements Comparable<Objects> {
    int age;
    String name;

    Recruiter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Recruiter(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recruiter recruiter = (Recruiter) o;
        return age == recruiter.age && Objects.equals(name, recruiter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public int compareTo(Objects o) {
        return 0;
    }
}
