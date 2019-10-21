package com.homework6;

public class Calculator {
    double calculate(Operation operation, float a,float b) {
        return operation.calculate(a,b);
    }
    public static void test_calculator(double a,double b,String anction){
        if (anction =="sum"){
            Operation oper=new Sum();//додавання
            System.out.println("sum: "+oper.calculate(a,b));
        }
        if (anction =="subtraction"){
            Operation oper=new Subtraction();//віднімання
            System.out.println("subtraction: "+oper.calculate(a,b));

        }
        if (anction =="power"){
            Operation oper=new Power();//піднесення числа a до степення b
            System.out.println("power: "+oper.calculate(a,b));

        }
        if (anction =="multiplication"){
            Operation oper=new Multiplication();//множення
            System.out.println("multiplication: "+oper.calculate(a,b));

        }
        if(anction=="division"){
            Operation oper=new Division();//ділення
            System.out.println("division: "+oper.calculate(a,b));

        }
    }
}
