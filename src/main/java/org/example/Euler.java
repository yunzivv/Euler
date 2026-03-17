package org.example;

// project Euler 36
public class Euler {
    public static void main(String[] args) {

        int answer = 0;

        for (int i = 999999999; i > 2; i -= 2) {

            int len = (int)Math.log10(i) + 1;
            int mask = Util.pandigital(0, i);

            if(mask != (1 << (len + 1)) - 2) continue;

            if (Util.isPrime(i)) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}