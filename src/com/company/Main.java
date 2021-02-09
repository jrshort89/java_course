package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean myTruth = false;

        System.out.println(myTruth);

        String myString = "this is a string";

        String newString = " new string";

        System.out.println(myString + newString);

        int myInt = 50;
        String numberString = "50";
        System.out.println(myInt + numberString);

        int result = 1 + 2;
        System.out.println(result);
        result++;
        result += 2;
        result *= 2;
        result /= 2;
        System.out.println(result);

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("But it is foreign");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore >= 100 && secondTopScore <= 60) System.out.println("you got both scores!");

        if (topScore > 100 || secondTopScore == 60) System.out.println("or operator works");

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("it equals 50 and it's not using the assignment operator, duh.");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This shouldn't work!");
        }

        //is car is reassigned on 51
        String wasCar = isCar ? "it's a car" : "It may have been a car";
        System.out.println("Ternary expression: " + wasCar);
    }
}
