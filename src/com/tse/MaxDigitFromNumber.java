package com.tse;

public class MaxDigitFromNumber {
    // 3. Display the max digit from a number
        public static int maxDigit(int number){
            int max = 0;
            while(number != 0){
                int lastDigit = number % 10;
                if(lastDigit > max){
                    max = lastDigit;
                }
                number /= 10;
            }
            return max;

        }
    }

