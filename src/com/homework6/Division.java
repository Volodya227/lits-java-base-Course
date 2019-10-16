package com.homework6;



public class Division implements Operation {
    @Override
    public double calculate(double a,double b){
        return a/b;//якщо дабл 0/0 вийде ніц-nun
    }
}
