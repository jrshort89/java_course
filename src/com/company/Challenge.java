package com.company;

public class Challenge {

    public static void main(String[] args) {
        double twenty = 20.00;

        double eighty = 80.00;

        double sum = twenty + eighty;

        System.out.println(sum);
        System.out.println(sum % 40);

        boolean remainderZero = sum % 40 == 0;
        System.out.println(remainderZero);

        if (!remainderZero) System.out.println("Got some remainder");
    }
}
