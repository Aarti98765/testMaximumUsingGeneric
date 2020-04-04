package com.bridgelabz.generic;

public class GetMaximum {
    public static  Integer findMaxIntegerValue(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximumIntegerValue = firstNumber;
        if (secondNumber.compareTo(maximumIntegerValue) > 0)
            maximumIntegerValue = secondNumber;
        if (thirdNumber.compareTo(maximumIntegerValue) > 0)
            maximumIntegerValue = thirdNumber;
        return maximumIntegerValue;
    }
    public static  Float findMaxFloatValue(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maximumFloatValue = firstNumber;
        if (secondNumber.compareTo(maximumFloatValue) > 0)
            maximumFloatValue = secondNumber;
        if (thirdNumber.compareTo(maximumFloatValue) > 0)
            maximumFloatValue = thirdNumber;
        return maximumFloatValue;
    }
    public static  String findMaxStringValue(String firstNumber, String secondNumber, String thirdNumber) {
        String maximumStringValue = firstNumber;
        if (secondNumber.compareTo(maximumStringValue) > 0)
            maximumStringValue = secondNumber;
        if (thirdNumber.compareTo(maximumStringValue) > 0)
            maximumStringValue = thirdNumber;
        return maximumStringValue;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the program of finding maximum one among all");
    }
}
