package org.example;

// Euler 57

import java.io.IOException;
import java.math.BigInteger;

public class Euler {
    public static void main(String[] args) throws IOException {

        int answer = 0;
        BigInteger s = BigInteger.valueOf(3);
        BigInteger p = BigInteger.TWO;

        for(int i = 0; i < 1000; i++) {
            BigInteger tmp = s;
            s = p.multiply(BigInteger.TWO).add(s);
            p = p.add(tmp);

            int sLen = String.valueOf(s).length();
            int pLen = String.valueOf(p).length();
            if(sLen > pLen) answer++;
        }

        System.out.println(answer);
    }
}