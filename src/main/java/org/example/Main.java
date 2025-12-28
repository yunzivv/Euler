package org.example;

// project Euler 10
public class Main {
    public static void main(String[] args) {

        long answer = 0;

        for(int i = 2; i <= 2000000; i++){
            if(isPrime(i)) answer += i;
        }

        System.out.println(answer);
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }
}