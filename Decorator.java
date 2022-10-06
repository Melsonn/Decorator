package com.company;

abstract public class Decorator implements Operations{
    public Operations operations;

    public Decorator(Operations operations) {
        this.operations = operations;
    }

    public String getAddition(){
        return operations.getAddition();
    }
    public double getCost(){
        return operations.getCost();
    }
}
