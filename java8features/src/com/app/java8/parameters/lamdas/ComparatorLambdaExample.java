package com.app.java8.parameters.lamdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        Comparator<Integer> comparator = (Integer a, Integer b) -> {
            return a.compareTo(b);
        };
        System.out.println(comparator.compare(5, 5));
    }
}
