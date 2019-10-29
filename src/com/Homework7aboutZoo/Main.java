package com.Homework7aboutZoo;

import com.homework6.Global;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ZooException {

        Zoo zoo = new Zoo();
        zoo.open(new Lion("Lion"), "Jack");
        zoo.open(new Rabbit("Rabbit"), "Ivan");
        zoo.open(new Eagle("Eagle"), "Petro");
        zoo.dinner("Jack", new Food("beef", "meat", 13.0));
        zoo.dinner("Ivan", new Food("carrot", "vegetable", 0.3));
        zoo.dinner("Petro", new Food("mouse", "meat", 1.1));


    }
}
