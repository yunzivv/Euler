package org.example;

import java.math.BigInteger;

// project Euler 20
public class Main {
    public static void main(String[] args) {

        int sum = 0;
        BigInteger h = BigInteger.ONE;

        for(int i = 1; i <= 100; i++){
            h = h.multiply(BigInteger.valueOf(i));
        }

        for(char c : h.toString().toCharArray()){
            sum += c - '0';
        }
        System.out.println(sum);
    }
}

