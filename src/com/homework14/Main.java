package com.homework14;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        iter();
        List<Double> arraylist = new ArrayList();
        System.out.println("time array list  " + longlist(arraylist, 100000));
        System.out.println("time array list random print " + random(arraylist, 100000));
        List<Double> linkedlist = new LinkedList();
        System.out.println("time linked list  " + longlist(linkedlist, 100000));
        System.out.println("time linked list random print " + random(linkedlist, 100000));
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();

        ArrayList<Person> list = new ArrayList();
        String[] name = {"Vova", "Natalya", "Pavlo", "Taras", "Tina", "Nastya", "andriy", "Roman"};
        for (int a = 1; a <= len; a++) {
            int d = new Random().nextInt(name.length);
            var person = new Person(a, name[d]);
            list.add(person);
        }
        System.out.println("list with person to doctor");
        for (int i = 0; i < list.size(); i++) {
            Person person = list.get(i);
            System.out.println("порядковий номер  " + person.number + "    імя клієнта  " + person.name);
        }
        System.out.println("doctor lifo  last in ,  first out");
        lifo(list);
        System.out.println("doctor fifo first in ,   first out");
        fifo(list);
    }

    private static void iter() {
        List list = new ArrayList();
        for (int w = 0; w < 25; w++) {
            list.add(w);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static long random(List<Double> list, int len) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            int a = new Random().nextInt(list.size());
            Double number = list.get(a);
            //System.out.print(number+"-");
        }
        System.out.println();
        long time2 = System.currentTimeMillis();
        long time3 = time2 - time1;
        return time3;
    }

    public static long longlist(List<Double> list, int len) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            double a = new Random().nextDouble();
            list.add(a);
        }
        long time2 = System.currentTimeMillis();
        long time3 = time2 - time1;
        return time3;
    }

    private static void fifo(List<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            Person person = list.get(i);
            System.out.println("порядковий номер  " + person.number + "    імя клієнта  " + person.name);
        }

    }

    private static void lifo(List<Person> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            Person person = list.get(i);
            System.out.println("порядковий номер  " + person.number + "    імя клієнта  " + person.name);
        }

    }
}
