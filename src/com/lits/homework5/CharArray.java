package com.lits.homework5;

public class CharArray extends Array {
    CharArray(int len){
        arr=new int[len];
    }
    void action(char c){
        var s=0;
        for(var i=0;i<arr.length;i++){
            if(((char)arr[i])==c&& s==0){
                System.out.println(true);
                s=1;
            }
        }
    }
    void printChar(char c){
        var string="";
        for(var i=0;i<arr.length;i++){
            string=string+(char)arr[i];
        }
        System.out.println(string);
    }
}
