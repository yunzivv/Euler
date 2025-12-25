package org.example;

// project Euler 6
public class Main {
    public static void main(String[] args) {

        long powSum = 0;
        long sumPow = 0;

        for(int i = 1; i <= 100; i++){
            powSum += Math.pow(i,2);
            sumPow += i;
        }

        System.out.println(Math.pow(sumPow, 2) - powSum);
    }
}