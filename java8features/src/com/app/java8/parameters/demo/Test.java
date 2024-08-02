package com.app.java8.parameters.demo;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        String s = " I am the creator of my destiny";
//
//        Map<String, Long> map = Arrays.stream(s.replaceAll("\\s","").split(""))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        map.forEach((k,v) -> System.out.println(k + ":" + v));

        //reverse a string
        String s = "Let us learn Java";
        String ss = Arrays.stream(s.replaceAll("\\s","").split("")).map(st->new StringBuilder(st).reverse().toString()).collect(Collectors.toList()).get(0);
        System.out.println(ss);
    }
}
