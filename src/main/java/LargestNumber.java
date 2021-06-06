/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String firstString = input.nextLine();
        double firstNum = Double.parseDouble(firstString);

        System.out.print("Enter the second number: ");
        String secondString = input.nextLine();
        double secondNum = Double.parseDouble(secondString);

        System.out.print("Enter the third number: ");
        String thirdString = input.nextLine();
        double thirdNum = Double.parseDouble(thirdString);

        double largestNum = 0;

        if(firstNum >= secondNum && firstNum >= thirdNum) {
            largestNum = firstNum;
        }
        if(secondNum >= firstNum && secondNum >= thirdNum) {
            largestNum = secondNum;
        }
        if(thirdNum >= secondNum && thirdNum >= firstNum) {
            largestNum = thirdNum;
        }
        if(firstNum==secondNum && secondNum==thirdNum && firstNum==thirdNum){
            return;
        }

        System.out.println("The largest number is " + largestNum +".");
    }
}

