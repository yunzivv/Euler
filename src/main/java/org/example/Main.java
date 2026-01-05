package org.example;

import java.util.ArrayList;
import java.util.List;

// project Euler 7
public class Main {
    public static void main(String[] args) {

        List<Integer> primes = new ArrayList<>();
        int n = 2;

        while(primes.size() < 10001) {
            if(isPrime(n)) primes.add(n);
            n++;
        }

        System.out.println(n-1);
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }
}