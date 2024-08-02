package com.app.java8.parameters.flowstatements;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(((year %4 ==0) && (year %100 !=0)) || (year %400 ==0)) {
            System.out.println("Given Year is Leap Year: " + year);
        }else {
            System.out.println("Given Year is Not Leap Year:" +year);
        }
    }
}
