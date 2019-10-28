package com.Homework7_Z00;

class Zoo {
    String[] animal = {"tiger","snake","owl","lion"};
    String[] person_name = {"Andriy","Volodya","Pavlo","Danylo"};
    void open_zoo(Human human,Animal animals,String name_person,String animal,String food){
        var number=1;
        for(var x =0;x<this.animal.length;x++){
            if(name_person == this.person_name[x] && animal == this.animal[x]){
                number*=0;
            }else{
                number*=1;
            }
        }
        if(number==0){
            human.feed_animal(animals,name_person,animal,food);
        }else if(number==1){
            System.out.println("name "+name_person+" i can't feed this "+animal);
        }
    }
}
