package com.company;

public class Main {

    public static void main(String[] args) {
        Operations ipad2 = new Keyboard(new iPad1());
        System.out.println(ipad2.getAddition() + " " +  ipad2.getCost());
        ipad2 = new Case(new iPad1());
        System.out.println(ipad2.getAddition() + " " + ipad2.getCost());

        Operations ipad3 = new Case(new iPad2());
        System.out.println(ipad3.getAddition() + " " + ipad3.getCost());
    }
}
