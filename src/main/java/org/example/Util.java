package org.example;

public class Util {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
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

    static int getTriangularIndex(long x) {
        double n = (Math.sqrt(1 + 8 * x) - 1) / 2;
        if (n == (int)n) return (int)n;
        return -1;
    }

    static int getPentagonalIndex(long x) {
        double n = (1 + Math.sqrt(1 + 24 * x)) / 6;
        if (n == (int)n) return (int)n;
        return -1;
    }

    static int getHexagonalIndex(long x) {
        double n = (1 + Math.sqrt(1 + 8 * x)) / 4;
        if (n == (int)n) return (int)n;
        return -1;
    }
}
