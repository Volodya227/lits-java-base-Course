package com.company;

public class Mas {
    public int[] arr;
    public void Mas(int len){
        this.arr=new int[len];
    }
    public void remove(int elem){
        for(var i=0;i<arr.length;i++){
            if (arr[i]==elem) {
                arr[i]=0;
            }
        }
    }
}
