package org.example;

// Euler 56

import java.math.BigInteger;

public class Euler {
    public static void main(String[] args) {

        int answer = 0;

        for(int a = 2; a < 100; a++){
            for(int b = 2; b < 100; b++){
                BigInteger sum = BigInteger.valueOf(a).pow(b);

                int n = 0;
                for(char c :sum.toString().toCharArray()){
                    n += c-'0';
                }

                answer = Math.max(answer, n);
            }
        }

        System.out.println(answer);
    }
}