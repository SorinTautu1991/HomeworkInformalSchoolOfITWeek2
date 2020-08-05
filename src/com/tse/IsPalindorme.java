package com.tse;

public class IsPalindorme {
    // 4. Check if a number is palindrome(e.g palindrom 1221 34143)

        public static boolean palindromeNumber(int number){
            int initialNumber = number;
            int newNumber = 0;

            while(number != 0){
                newNumber = newNumber * 10 + number % 10;
                number /= 10;
            }
            if(newNumber == initialNumber){
                return true;
            } else {
                return false;
            }
        }
    }
