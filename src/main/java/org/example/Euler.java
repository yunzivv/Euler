package org.example;

import java.util.HashSet;
import java.util.Set;

// project Euler 32
public class Euler {
    public static void main(String[] args) {

        int answer = 0;
        Set<Integer> pandigital = new HashSet<>();

        for(int a = 1; a <= 9; a++){

            for(int b = 1023; b <= 9876; b++){

                int c = a * b;

                int mask = 1 << a;
                mask = pandigital(mask, b);
                if(mask == -1) continue;
                mask = pandigital(mask, c);
                if(mask == -1) continue;

                if(mask == 0b1111111110) pandigital.add(c);
            }
        }

        for(int a = 12; a <= 99; a++){

            for(int b = 102; b <= 987; b++){
                int c = a * b;

                int mask = pandigital(0, a);
                if(mask == -1) continue;

                mask = pandigital(mask, b);
                if(mask == -1) continue;

                mask = pandigital(mask, c);
                if(mask == -1) continue;

                if(mask == 0b1111111110) pandigital.add(c);
            }
        }

        for(int a : pandigital){
            answer += a;
        }

        System.out.println(answer);
    }

    static int pandigital(int mask, int n){
        while(n > 0){
            int d = n % 10;

            if(d == 0) return -1;
            if((mask & (1 << d)) != 0) return -1;

            mask |= 1 << d;
            n /= 10;
        }
        return mask;
    }
}