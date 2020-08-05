package com.tse;

public class DisplayPrimeNumbers {
    // 5. Display all the prime numbers lower than a given number

    public static void displayPrimeNumbers(int number){
        if(number < 2){
            System.out.println("Not prime");
        }

        for(int i=2;i<=number;i++){
            boolean isPrime = true;

            for(int j=2;j<i;j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("The prime number is: " + i);
            }
        }


    }
}
