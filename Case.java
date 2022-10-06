package com.company;

public class Case extends Decorator {
    public Case(Operations operations) {
        super(operations);
    }

    public String getAddition() {
        return operations.getAddition() + ", and case";
    }

    public double getCost() {
        return operations.getCost() + 5000;
    }
}
