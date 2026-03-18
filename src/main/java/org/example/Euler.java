package org.example;

import java.io.IOException;

// project Euler 44
public class Euler {
    public static void main(String[] args) throws IOException {

        int answer = Integer.MAX_VALUE;

        for(int i = 8; i < 10000; i++){
            int s = getPentagonal(i);

            for(int a = 1; a < i; a++){
                int b = getPentagonalIndex(s - getPentagonal(a));

                if(b != -1){
                    int sub = Math.abs(getPentagonal(a) - getPentagonal(b));
                    if(getPentagonalIndex(sub) != -1) answer = Math.min(answer, sub);
                }
            }

        }

        System.out.println(answer);
    }

    static int getPentagonalIndex(int x) {
        double n = (1 + Math.sqrt(1 + 24 * x)) / 6;
        if (n == (int)n) return (int)n;
        return -1;
    }

    static int getPentagonal(int n){
        return n * (3 * n - 1) / 2;
    }
}