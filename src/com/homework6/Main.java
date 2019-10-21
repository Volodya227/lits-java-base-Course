package com.homework6;

public class Main {
    public static void main(String[] args) {
        var calculator = new Calculator();
        calculator.test_calculator(4,0,"division");
        test_enum(2,"sitroen");
    }
    public static void test_enum(int id,String code){
        Cars a=Cars.Honda;
        if(id<=0){
            System.out.println(Cars.findByCode(code));
        }else{
            System.out.println(Cars.findById(id));
        }

    }

}
