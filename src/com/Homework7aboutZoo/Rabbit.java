package com.Homework7aboutZoo;

class Rabbit implements Animals {
    private String name;

    Rabbit(String name){
        this.name=name;
    }
    @Override
    public String eat(Food food){
        if(food.type=="vegetable"){
            return "crum - crum";
        }else{
            return "rabbits don't eat "+food.name;
        }
    }
}
