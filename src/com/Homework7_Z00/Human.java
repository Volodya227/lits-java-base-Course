package com.Homework7_Z00;

import java.sql.SQLOutput;

class Human {
    String[]name;
    String[]animal;
    String[]food;
    Human(String[] name,String[] animal,String[] food){
        this.name=name;
        this.animal=animal;
        this.food=food;
    }
    void feed_animal(Animal animals,String name,String animal,String food){
        System.out.println(animals.feed(this.animal,this.food,animal,food)+food+" name person "+name);
    }
}
