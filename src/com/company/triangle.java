package com.company;

public class triangle {

    public double a;
    public double b;
    public double c;
    public double area(double a,double b,double c){
        var p = (a+b+c)/2;
        var s = ((a+p)*(b+p)*(c+p));
        return s;
    }
}
