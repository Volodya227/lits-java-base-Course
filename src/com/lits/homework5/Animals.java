package com.lits.homework5;

public class Animals extends Live{
    int paws;//кількість лап
    Animals(int m,int v,int age,int paws){
        super(m,v,age);
        this.paws=paws;
        System.out.println(m);
    }
}
