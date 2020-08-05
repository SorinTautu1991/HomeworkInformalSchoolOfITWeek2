package com.tse;

public class DisplaySmallestNumber {
    // 2. Display the smallest number from an array of numbers.

    public static int smallestNumber(int[] array){

        int min = array[0];
        for(int i=0;i<=array.length-1;i++){
            if(array[i]<array[0]){
                min = array[i];
            }
        }
        return min;
    }
}
