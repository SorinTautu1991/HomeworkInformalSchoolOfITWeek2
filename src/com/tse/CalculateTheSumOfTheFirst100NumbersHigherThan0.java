package com.tse;


    public class CalculateTheSumOfTheFirst100NumbersHigherThan0 {
        // 1. Calculate the sum of the first 100 numbers higher than 0.

        public static int suma(){
            int suma = 0;
            for(int i=1;i<=100;i++){
                suma += i;
            }
            return suma;
        }

        public static int sumaVarDoi(){
            return (100*(100+1))/2;
            // formula matematica: n(n+1)/2.
        }
    }

