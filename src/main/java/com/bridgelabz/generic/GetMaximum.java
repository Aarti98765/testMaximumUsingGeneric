package com.bridgelabz.generic;

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
    //Print result
    private static <E> void printMax(E result) {
        System.out.println(result);
    }
    //Find maximum from three values
    public static <E extends Comparable> E checkMaximum(E first, E second, E third) {
        E maximum = first;
        if (second.compareTo(maximum) > 0)
            maximum = second;
        if (third.compareTo(maximum) > 0)
            maximum = third;
        return maximum;
    }

    public E checkMaximum() {
        E result = checkMaximum(first,second, third);
        printMax(result);
        return result;
    }
}
