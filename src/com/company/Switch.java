package com.company;

public class Switch {
    public static void main(String[] args) {
        int value = 3;
        switch(value) {
            case 1:
                System.out.println("Value is one.");
                break;
            case 3:
                System.out.println("Value is three.");
                break;
            default:
                System.out.println("Was not a registered number.");
        }
    }
}
