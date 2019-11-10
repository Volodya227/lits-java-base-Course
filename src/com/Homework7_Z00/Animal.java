package com.Homework7_Z00;

class Animal {
    String feed(String[] animal,String[] food,String animals,String foods) {
        var number=1;
        for (var i=0;i<food.length;i++){
            if (animal[i]==animals&&food[i]==foods) {
                number*=0;
            }else{
                number*=1;
            }
        }
        if(number==0){
            return animals+" thank you ";
        }else{
            return animals+" I don't eat this food ";
        }
    }
}
