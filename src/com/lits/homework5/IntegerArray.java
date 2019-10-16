package com.lits.homework5;

class IntegerArray extends Array{


    IntegerArray(int len){
        arr=new int[len];
    }
    int sum(){
        var sum=0;
        for(var i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    Double e(){
        var sum=0.0;
        for(var i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        sum/=arr.length;
        return sum;
    }
    int sumEven(){
        var sum=0;
        for(var i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
