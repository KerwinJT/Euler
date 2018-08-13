package com.company;



public class SumOf5and3 {

public void summingOperatoin() { //This method Sums numbers that are divisible by 3 and 5.
                                 //There is a console printout that helps track the progress.
    {                            //This printout also helps to debug and prove that the method is working.
        int sum = 0;
        int divisableNumbers = 0;

        for (int i = 0; i < 1000; i++) {
            System.out.println("Current 'i' = " + i);
            if (i % 3 == 0 && i % 5 == 0 && (i != 0)) {
                System.out.println("This number is divisible by 3 and 5");
                sum += i;
                divisableNumbers++;
            } else if (i % 3 == 0 && !(i % 5 == 0)) {
                System.out.println("This number is divisible by 3 but not 5");
                sum += i;
                divisableNumbers++;
            } else if (i % 5 == 0 && !(i % 3 == 0)) {
                System.out.println("This number is divisible by 5 but not 3");
                sum += i;
                divisableNumbers++;
            } else System.out.println("This number is not divisible by 3 or 5.");

            System.out.println("Current sum = " + sum);
        }
        System.out.println("Final sum = " + sum + ". And, the total divisible numbers = " + divisableNumbers);
    }
}
}
