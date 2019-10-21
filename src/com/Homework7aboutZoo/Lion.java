package com.Homework7aboutZoo;

class Lion implements Animals {
    private String name;

    Lion(String name){
        this.name=name;
    }
    @Override
    public String eat(Food food){
        if(food.type=="meat"){
            return "yammy";
        }else{
            return "lions don't eat "+food.name;
        }
    }



}
