package com.company;

import java.util.Arrays;
import java.util.Random;


class Array {
    public int[]arr;// = new int[10];

    public void print() {
        System.out.println((Arrays.toString(arr)));

    }
    public void sort(){

        int [] mas = arr;//this.arr;//{9,4,6,3,2,4,5,1,2};
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }

    }

    public Array(int len) {
        this.arr =new int[len];
    }
    public void spam(int max){

        for(var i= 0;i<arr.length;i++){
            arr[i]= new Random().nextInt(max);
        }


    }
    public void udit(String anction){
        if(anction=="even"){
            for(var i=0;i<arr.length;i++){
                if(i%2==0){
                    System.out.print(arr[i]+"  ");
                }
            }
        }else if(anction=="not even") {
                for (var i = 0; i < arr.length; i++) {
                    if (i % 2 == 1) {
                        System.out.print(arr[i]+"  ");
                    }
                }
            }

        System.out.println("exit");
    }
    public void r(String anction,int number){
        if(anction=="even"){
            for(var i=0;i<arr.length;i++){
                if(i%2==0){
                    arr[i] = number;
                }
            }
        }else if(anction=="not even") {
                for (var i = 0; i < arr.length; i++) {
                    if (i % 2 == 1) {
                        arr[i]=number;
                    }
                }
            }
        }
}

