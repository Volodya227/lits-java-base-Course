package com.company;

import java.util.Random;

public class home_work3 {
    public static void main(String[] args) {
        var random_number = new Random().nextInt(2);
        var chr = '8';
        var a_cat = 0;
        var answer =0.0;
        var dog = 0;
        if(random_number == 0){
            chr = '-';
        }else if(random_number == 1){
            chr = '+';
        }else if(random_number == 2){
            chr = '*';
        }
        if(chr=='-'){
            a_cat = 6;
            dog = 5;
        }else if(chr=='+'){
            a_cat = 35;
            dog = 23;
        }else if(chr=='*'){
            a_cat = 8;
            dog = 4;
        }
        answer = a_cat+11/12*(dog+dog)/12 ;
        System.out.println(answer);
        System.out.println(a_cat+" "+dog);
        /*var x = 0;
        var znak = "";
        if (znak == "-"){
            for(var r = 1;r<=100;r++){
                System.out.println(r);
            }
        }else if (znak == "+"){
            var v = 0;
            for(var c = 1;c<=100;c++){
                v+=c;
            }
            System.out.println(v);

        }else if (znak == "*"){
            for(var n = 0;n<=100;n++){
                if(n<=2){
                    System.out.println(n);
                }
            }

        }else if (znak == "/"){
            var sum = 0;
            for(var s = 100;s<=200;s++){
                if(s>=198){
                    sum+=s;
                }
            }
            System.out.println(sum);

        }else if(znak =="&"){
            var w = new Random().nextInt(10);
            for(var p=0;p<=100;p++){
                if(p%7==0){
                    System.out.print(p+" ");
                }
            }

        }else if(znak =="%"){
            var l = 'w';
            var i = 0;
            for(i = 0;i<=50;i++){
                l = (char)i;
                System.out.println(l+" = "+i);
                //test
            }

        }else{
            var a = 'q';
            for (var o = 100;o >= 0;o--){
                a = (char)o;
                System.out.println(a+" = "+o);
            }

        }
        */
    }
}
