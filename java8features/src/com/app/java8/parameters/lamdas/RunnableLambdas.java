package com.app.java8.parameters.lamdas;

public class RunnableLambdas {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("Running thread 1....");
        };

        Runnable runnable1 = () -> System.out.println("Running thread 2....");

        new Thread(() -> System.out.println("inside thread method")).start();
        new Thread(runnable).start();
        new Thread(runnable1).start();
    }
}
