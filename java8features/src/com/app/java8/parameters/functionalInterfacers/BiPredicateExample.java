package com.app.java8.parameters.functionalInterfacers;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = ( (a,b) -> a%2 ==0 && b%5 == 0);
        System.out.println(biPredicate.test(10, 5));
    }
}
