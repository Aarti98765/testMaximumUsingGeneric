package com.bridgelabz.generic;

public class GetMaximum<E extends Comparable> {
    E first;
    E second;
    E third;
    public GetMaximum(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public E checkMaximum() {
        return checkMaximum(first,second, third);
    }
    public static <E extends Comparable> E checkMaximum(E first, E second, E third) {
        E maximum = first;
        if (second.compareTo(maximum) > 0)
            maximum = second;
        if (third.compareTo(maximum) > 0)
            maximum = third;
        return maximum;
    }
}
