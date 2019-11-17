package com.homework15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        three();
    }

    static void three() {
        String[] name = new String[2];
        int[] age = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("name:");
            name[i] = new Scanner(System.in).next();
            System.out.println("age:");
            age[i] = new Scanner(System.in).nextInt();
        }
        Developer developer = new Developer(name[0], age[0]);
        Recruiter recruiter = new Recruiter(name[1], age[1]);
        System.out.println("Developer name:" + developer.name + " age:" + developer.age);
        System.out.println("recruiter name:" + recruiter.name + " age:" + recruiter.age);
    }

    static void second() {
        HashSet<Person> hashset = new HashSet<>();
        LinkedHashSet<Person> linkedhashset = new LinkedHashSet<>();
        var treeSet = new TreeSet<>();
        String[] name = {"Vova", "Andriy", "Natalya", "Katya", "Danylo"};
        for (int i = 0; i < 5; i++) {
            Person person = new Person(name[i], (new Random().nextInt(50)));
            hashset.add(person);
            linkedhashset.add(person);
            treeSet.add(person);
        }
        System.out.println(hashset);
        System.out.println(linkedhashset);
        System.out.println(treeSet);

    }

    static void first() {
        Recruiter recruiter = new Recruiter("andriy", 3);
        Recruiter recruiter1 = new Recruiter("andriy", 3);
        Developer developer = new Developer("Vova", 20);
        Employee employee = new Employee("andriy", 3);
        System.out.println(recruiter.equals(recruiter1));
    }
}
