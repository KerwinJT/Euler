package com.company;

public class EvenFibonacciNumbers {

    public void evenFibonacciSummming(){
        int sum = 0;
        int fibonacci = 1;
        int oldFibonacci = fibonacci;

        for (int i = fibonacci; i <4000000; i = oldFibonacci){
            System.out.println("Current Fibonacci Number: " + fibonacci);
            oldFibonacci = fibonacci;
            fibonacci = oldFibonacci + i;
            if(i%2==0){
                sum+=i;
            }

        }
        System.out.println("Total of even fibonacci numbers is: " + sum);
    }
}
