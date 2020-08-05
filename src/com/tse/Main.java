package com.tse;

public class Main {

    public static void main(String[] args) {
        CalculateTheSumOfTheFirst100NumbersHigherThan0 result = new CalculateTheSumOfTheFirst100NumbersHigherThan0();
        System.out.println("The sum of the first 100 numbers is : " + result.suma());
        System.out.println("The sum of the first 100 numbers is(Method 2): " + result.sumaVarDoi());

        // second exercise call
        DisplaySmallestNumber res = new DisplaySmallestNumber();
        int[] array = {1, 2, 33, 56, 89};
        System.out.println("The smallest number in the given int array is : " + res.smallestNumber(array));

        // Third exercise call
        MaxDigitFromNumber maxDigit = new MaxDigitFromNumber();
        System.out.println("The max digit in the given number is : " + maxDigit.maxDigit(7654329));

        //Fourth exercise call
        IsPalindorme isPal = new IsPalindorme();
        System.out.println("Number palindrome/not palindorme : -> " + isPal.palindromeNumber(1221));

        //Fifth exercise call
        DisplayPrimeNumbers displayPrime = new DisplayPrimeNumbers();
        displayPrime.displayPrimeNumbers(20);

    }
}
