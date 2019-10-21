package com.Homework7aboutZoo;

class Eagle implements Animals{
    private String name;

    Eagle(String name){
        this.name=name;
    }
    @Override
    public String eat(Food food){
        if(food.type=="meat"&&food.weight<=1){
            return "yammy";
        }else if(food.type=="meat"&& food.weight>1){
            return "this is too big";
        }else{
            return "eagles don't eat "+food.name;
        }
    }


}
