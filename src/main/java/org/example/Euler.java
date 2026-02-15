package org.example;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.Arrays;

// project Euler 14
public class Euler {
    public static void main(String[] args) {

        int max = 0;
        int num = 0;

        for (int start = 2; start <= 1_000_000; start++) {
            long n = start;
            int count = 0;

            while (n != 1) {
                count++;
                if ((n & 1) == 0) n /= 2;
                else n = n * 3 + 1;
            }

            if (count > max) {
                max = count;
                num = start;
            }
        }

        System.out.println(num);
    }
}