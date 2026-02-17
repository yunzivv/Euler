package org.example;

// project Euler 21
public class Euler {
    public static void main(String[] args) {

        int[] d = new int[10000];

        for (int i = 1; i < 10000; i++) {
            for (int j = i * 2; j < 10000; j += i) {
                d[j] += i;
            }
        }

        int sum = 0;
        for (int a = 2; a < 10000; a++) {
            int b = d[a];
            if (b != a && b < 10000 && b > 0 && d[b] == a) {
                sum += a;
            }
        }

        System.out.println(sum);
    }
}