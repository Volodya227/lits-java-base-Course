package com.lits.homework5;

import java.util.Random;

class Array {
    int[] arr;
    Array(){

    }
    Array(int len){
        arr=new int[len];
    }
    void spam(int max){
        for(var i=0;i<arr.length;i++){
            arr[i]=new Random().nextInt(max);
        }
    }
    void print(){
        for(var i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    int printNotEven(){
        var sum=0;
        for(var i=0;i<arr.length;i++){
            if(i%2!=0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
