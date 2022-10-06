package com.company;

public class Keyboard extends Decorator{
    public Keyboard(Operations operations){
        super(operations);
    }

    public String getAddition(){
        return operations.getAddition() + ", and keyboard";
    }
    public double getCost(){
        return operations.getCost() + 30000;
    }
}
