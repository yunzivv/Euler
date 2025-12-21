package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// project Euler 3
public class Main {
    public static void main(String[] args) {

        long num = 600851475143l;
        long prime = 1;

        for(long i = 2; i < num; i++) {
            if(num % i == 0) {
                if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i % 11 == 0) continue;
                if(isPrime(i))prime = i;
            }
        }

        System.out.println("biggest prime: " + prime);
    }

    public static boolean isPrime(long n){
        for(long i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        System.out.println("prime: " + n);
        return true;
    }
}