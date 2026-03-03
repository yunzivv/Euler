package org.example;

// project Euler 40
public class Euler {
    public static void main(String[] args) {

        int[] d = new int[1_000_001];
        int n = 0;

        for (int i = 0; i <= 1_000_000 && n < d.length; i++) {
            String s = String.valueOf(i);
            for (int k = 0; k < s.length() && n < d.length; k++) {
                d[n++] = s.charAt(k) - '0';
            }
        }

        System.out.println(d[1] * d[10] * d[100] * d[1000] * d[10000] * d[100000] * d[1000000]);
    }
}