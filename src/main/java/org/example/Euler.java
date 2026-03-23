package org.example;

// Euler 53

public class Euler {
    public static void main(String[] args) {

        int answer = 0;

        for (int n = 23; n <= 100; n++) {
            long comb = 1;

            for (int r = 1; r <= n / 2; r++) {
                comb = comb * (n - r + 1) / r;

                if (comb > 1_000_000) {
                    answer += (n - 2 * r + 1);
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}