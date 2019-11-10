package com.lesson9;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        for(var i=0;i<10;i++){
            sb.append(i);
        }
        System.out.println(sb);
        StringBuilder sb1=new StringBuilder();
        for(var i=0;i<10;i++){
            sb1.append(i);
        }
        System.out.println(sb1);
        /*String one="hello world";
        String two =new String("hello world");
        String three="hello world";
        if(one==two){
            System.out.println(1);
        }
        if(one.equals(two)){
            System.out.println(2);
        }
        if(one==three){
            System.out.println(3);
        }
        if(one.equals(three)){
            System.out.println(4);
        }

         */

    }
}
