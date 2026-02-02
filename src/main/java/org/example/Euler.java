package org.example;

import java.math.BigInteger;
import java.util.Arrays;

// project Euler 25
public class Euler {
    public static void main(String[] args) {

        BigInteger num1 = BigInteger.ONE;
        BigInteger num2 = BigInteger.ONE;
        BigInteger temp;
        int count = 1;

        while(true){
            temp = num2;
            num2 = num1.add(num2);
            num1 = temp;
            count++;
            if(num2.toString().length() == 1000)break;
        }

        System.out.println(count + 1);
    }
}