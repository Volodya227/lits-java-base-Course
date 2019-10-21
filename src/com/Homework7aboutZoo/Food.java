package com.Homework7aboutZoo;

import javax.xml.namespace.QName;

public class Food {
    String name;
    String type;
    double weight;
    Food(String name, String type,double weight) {
        this.name = name;
        this.type = type;
        this.weight=Math.abs(weight);
    }



}
