package org.example;


// project Euler 48
public class Euler {
    public static void main(String[] args) {

        long answer = 0L;

        for(int i = 1; i <= 1000; i++){
            long n = i;
            for(int j = 1; j < i; j++){
                n *= i;
                n %= 10000000000L;
            }

            answer += n;
            answer %= 10000000000L;
        }

        System.out.println(answer);

    }
}