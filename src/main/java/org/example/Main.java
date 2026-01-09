package org.example;

import java.math.BigInteger;

// project Euler 15
public class Main {
    public static void main(String[] args) {

        Long map = 20L;

        BigInteger c = BigInteger.ONE;
        BigInteger s = BigInteger.ONE;

        for(int i = 1; i <= map; i++) {
            s = s.multiply(BigInteger.valueOf(i));
            c = c.multiply(BigInteger.valueOf(i+map));
        }

        System.out.println(c.divide(s));

    }
}