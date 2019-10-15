package com.company;

import java.util.Arrays;
import java.util.Random;

public class Lesson_4 {
    //public static void main(String[] args) {
        /*var person1 = new Person();
        var person2 = new Person();
        var person3 = new Person();
        person1.name = "Volodya";
        person1.age = 23;
        Person.str();

         */
        //red();
    //}
    public static void main(String[] args) {
        int [] mas = {9,4,6,3,2,4,5,1,2};
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
