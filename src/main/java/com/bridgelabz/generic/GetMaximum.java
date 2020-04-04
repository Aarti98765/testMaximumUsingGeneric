package com.bridgelabz.generic;

public class GetMaximum {
    public static  Integer findMaxInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximumValue = firstNumber;
        if (secondNumber.compareTo(maximumValue) > 0)
            maximumValue = secondNumber;
        if (thirdNumber.compareTo(maximumValue) > 0)
            maximumValue = thirdNumber;
        return maximumValue;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the program of finding maximum one among all");
    }
}
