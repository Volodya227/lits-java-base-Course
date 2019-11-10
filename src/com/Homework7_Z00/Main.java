package com.Homework7_Z00;

class Main {
    static void main(String[] args) {
        var zoo=new Zoo();
        var food=new Food();
        var animals=new Animal();
        var human = new Human(zoo.person_name,zoo.animal,food.food);
        //create all class
        feed_animals1(zoo,animals,human,"Danylo","lion","meet");
        feed_animals1(zoo,animals,human,"Andriy","tiger","meet");
        feed_animals1(zoo,animals,human,"Volodya","snake","mouse");
        feed_animals1(zoo,animals,human,"Pavlo","owl","mouse");
        feed_animals1(zoo,animals,human,"Danylo","owl","meet");
    }
    static void feed_animals1(Zoo zoo,Animal animals,Human human,String name_person,String animal,String food){
        zoo.open_zoo(human,animals,name_person,animal,food);
    }
}
