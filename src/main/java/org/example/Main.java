package org.example;

import java.math.BigInteger;

// project Euler 17
public class Main {
    public static void main(String[] args) {

        int[] one = {0,3,3,5,4,4,3,5,5,4};
        int[] teen = {0,3,6,6,8,8,7,7,9,8,8};
        int[] tens = {0,0,6,6,5,5,5,7,6,6};
        int and = 3;
        int hundred = 7;

        long sum = 0;

        for (int i = 1; i <= 999; i++) {
            int n = i;

            if (n >= 100) {
                sum += one[n / 100] + hundred;
                if (n % 100 != 0) sum += and;
                n %= 100;
            }

            if (n >= 20) {
                sum += tens[n / 10];
                sum += one[n % 10];
            } else if (n >= 10) {
                sum += teen[n - 9];
            } else {
                sum += one[n];
            }
        }
        System.out.println(sum + 11);
    }
}