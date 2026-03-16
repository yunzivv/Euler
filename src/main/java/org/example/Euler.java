package org.example;

import java.util.HashSet;
import java.util.Set;

// project Euler 38
public class Euler {
    public static void main(String[] args) {

        int answer = 0;
        int cnt = 0;
        int num = 35;

        while(cnt < 11){
            num += 2;

            int n = num;
            boolean ok = isPrime(n);

            if(ok) {
                while (n >= 10 && ok) {
                    n /= 10;
                    if(!isPrime(n)) ok = false;
                }
            }

            if(ok){
                n = num;
                int pow = 1;
                while(pow <= n) pow *= 10;
                pow /= 10;

                while (n >= 10 && ok) {
                    n %= pow;
                    if(!isPrime(n)) ok = false;
                    pow /= 10;
                }
            }

            if(ok) {
                cnt++;
                answer += num;
            }
        }

        System.out.println(answer);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}