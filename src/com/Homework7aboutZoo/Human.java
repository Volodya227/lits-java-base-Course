package com.Homework7aboutZoo;

class Human {
    String name;
    int age;
    Animals animal;
    Human(String name,int age){
        this.name = name;
        this.age = Math.abs(age);

    }
    void feed_animal(Food food){
        if(animal==null){
            System.out.println("haven't got animal");
        }else{
            System.out.println(animal.eat(food));
        }
    }

    public Animals getAnimal() {
        return animal;
    }

    public void setAnimal(Animals animal) {
        this.animal = animal;
    }
}
