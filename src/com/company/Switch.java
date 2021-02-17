package com.company;

public class Switch {
    public static void main(String[] args) {
        int value = 4;
        switch(value) {
            case 1:
                System.out.println("Value is one.");
                break;
            case 3:
                System.out.println("Value is three.");
                break;
            case 4: case 5: case 6:
                System.out.println("Was 4, 5, or 6.");
                break;
            default:
                System.out.println("Was not a registered number.");
        }

        int count = 0;
        while (count < 10) {
            System.out.println("This is the count: " + count);
            count++;
        }

        count = 1;

        do {
            System.out.println("Count value was: " + count);
            count++;
        } while (count < 6);

        count = 0;

        do {
            count++;
            if (count % 2 == 0) continue;
            System.out.println("This is odd: " + count);
        } while (count < 10);
    }
}
