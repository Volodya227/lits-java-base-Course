package lesson7Praktic;

import javax.swing.text.ElementIterator;

public class Lion extends Elephant{
    boolean hangry=true;
    void eat(String food1,String food){
        if(food=="meet"){
            hangry=false;
        }
    }
}
