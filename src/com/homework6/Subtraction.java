package com.homework6;

public class Subtraction implements Operation {
    @Override
    public double calculate(double a,double b){
        double result = a-b;
        return result;
    }
}
