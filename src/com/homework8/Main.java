package com.homework8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        a("+38(044)-228-32-27");
        a("+38(374) 294 44 21");
        a("+38(205)-395-67-32");
        a("+38(044)-228-32-27");
        a("+38(194)-186 10-22");
        a("044-228-32-27");
        a("+38044-228-32-27");
        a("+38068-237-25-44");
        b("balzammist2018@email.com");
        b("donnalonhyk.m@email.com");
        b("fhfh@meta.ua");
        b("halyna.pashychic.t@ekolend.lviv.ua");
        b("vova-227hukerIsPro@gmail.com");
        c("Main interface person spiderMan");
        c("Person class Vova huker");
        d("azaaza");
        d("nun");
        d("hello world");
        d("nune");




    }
    static void d(String str){
        char[] strToArray = str.toCharArray();
        // Вывод массива на экран

        var bool = 1;
        for (var i = 0; i < (strToArray.length / 2 + 1); i++) {
            int len=strToArray.length-1-i;
            if(strToArray[i]==strToArray[len]){
                bool*=1; }else{
                bool*=0;
            }
        }
        if(bool==1){
            System.out.println("this string "+str+" is polidrom");
        }else{
            System.out.println("this string "+str+" isn't polidrom");
        }
    }
    static void c(String str){

        String[] words = str.split("\\s");
        // Вывод на экран
        var i=0;
        String[]array={"","","",""};
        for(String subStr:words) {
            array[i]=subStr;
            //System.out.println(i+subStr);
            i+=1;
        }
        System.out.print("class: "+array[0]);
        System.out.print("  type: "+array[1]);
        System.out.print("  name: "+array[2]);
        System.out.println("  value: "+array[3]);

    }
    static void b(String email){
        Pattern pattern=Pattern.compile("(((([0-9]*)([-]*)([.]*)([a-z]*)([A-Z]{0,15}))*)([@]{1})([gmail]*)([meta]*)([email]*)([ekolend]*)([.])([com]*)([lviv]*)([.]*)([ua]*))");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println(email+" is corect");
        }else{
            System.out.println(email+" isn't corect");
        }
    }
    static void a(String phoneNumber) {

        Pattern pattern = Pattern.compile("([+38]*)([(]*)([0-9]{3})([)]*)([ ]*)([-]*)([0-9]{3})([ ]*)([-]*)([0-9]{2})([ ]*)([-]*)([0-9]{2})");
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.println("Phone number " + phoneNumber + " is corect");
        } else {
            System.out.println("Phone number " + phoneNumber + " isn't corect");
        }
    }

}
