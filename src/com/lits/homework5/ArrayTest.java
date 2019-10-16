package com.lits.homework5;

public class ArrayTest {
    public static void main(String[] args) {
        var a=new Array(5);
        a.spam(4);
        a.print();
        var b=new IntegerArray(9);
        b.spam(100);
        var num=b.e();
        System.out.println(num);
    }
}
