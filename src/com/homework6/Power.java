package com.homework6;

class Power implements Operation {
    @Override
    public double calculate(double a,double b){
        double result;
        if(b>0||b<0){
            result=a;
        } else {
            result = 0;
        }
        for(var i=0;i<=b;i++){
            result*=result;
        }
        if(b==0){
            result=1;
        }
        if(b<0){
            result = 1/result;
        }
        return result;
    }
}
