package com.bridgelabz.generic;

import java.util.Arrays;

public class GetMaximum<E extends Comparable> {
    E first;
    E second;
    E third;

    //Parameterized constructor
    public GetMaximum(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    //Default constructor
    public GetMaximum() {
    }

    //Print result
    private static <E> void printMax(E result1) {
        System.out.println(result1);
    }

    //Find maximum from any number of values
    public static <E extends Comparable> E checkMaximum(E...arrayValues) {
        Arrays.sort(arrayValues);
        E maximum = arrayValues[arrayValues.length-1];
        printMax(maximum);
        return maximum;
    }

    public E checkMaximum() {
      E result = checkMaximum();
      printMax(result);
      return result;
    }
}
