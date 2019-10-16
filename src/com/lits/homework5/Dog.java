package com.lits.homework5;

public class Dog extends Wolf{
    boolean walking;//if true: then walking
    Dog(int m,int v,int age,int paws,boolean sleep,boolean walking){
        super(m,v,age,paws,sleep);
        if(sleep==false){
            this.walking=walking;
        }else{
            this.walking=false;
        }
    }
}
