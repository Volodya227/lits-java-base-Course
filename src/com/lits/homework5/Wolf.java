package com.lits.homework5;

public class Wolf extends Animals{
    boolean sleep;//спить чи ні
    Wolf(int m,int v,int age,int paws,boolean sleep){
        super(m,v,age,paws);
        this.sleep=sleep;
    }
}
