package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//  від 0 до 50
        /*var x = 'w';
        var i = 0;
        for(i = 0;i<=50;i++){
            x = (char)i;
            System.out.println(x+" = "+i);
            //test
        }
        var a = 'q';
        for (var i = 100;i >= 0;i--){
            a = (char)i;
            System.out.println(a+" = "+i);
        }
        */
        /*
        var a = 2.5;
        var b = 1;
        var z = ((a+11)*(b+b)/12);
        System.out.println(z);
         */

        var x = 0;
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

    }
}
