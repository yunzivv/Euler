package org.example;


import java.util.HashSet;
import java.util.Set;

// project Euler 47
public class Euler {
    public static void main(String[] args) {

        int answer = 0;
        int n = 0;

        int[] primes = new int[1000];

        for(int i = 2; i < 10000; i++){
            if(n == 1000) break;
            if(Util.isPrime(i)) primes[n++] = i;
        }

        n = 30;
        int cnt = 0;
        boolean find = false;

        while(true){

            Set<Integer> primesSet = new HashSet<>();

            int m = n;
            for(int i = 0; i < 1000; i++){
                if(m == 0) break;
                while(m % primes[i] == 0) {
                    primesSet.add(i);
                    m /= primes[i];
                }
            }

            if(primesSet.size() == 4){
                cnt++;
                if(!find) answer = n;
                find = true;
            } else {
                find = false;
                cnt = 0;
            }

            if(cnt == 4) break;
            n++;
        }

        System.out.println(answer);

    }
}