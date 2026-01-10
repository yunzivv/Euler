package org.example;

import java.math.BigInteger;

// project Euler 16
public class Main {
    public static void main(String[] args) {

        BigInteger p = BigInteger.ONE;
        int s = 0;

        for(int i = 1; i <= 1000; i++) {p = p.multiply(BigInteger.TWO);}

        String str = p.toString();
        for(char c : str.toCharArray()) {
            s += c - '0';
        }

        System.out.println(s);

    }
}