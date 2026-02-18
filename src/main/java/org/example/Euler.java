package org.example;

import java.util.ArrayList;

// project Euler 23
public class Euler {
    public static void main(String[] args) {

        int[] sum = new int[28124];

        for (int i = 1; i <= 28123 / 2; i++) {
            for (int j = i * 2; j <= 28123; j += i) {
                sum[j] += i;
            }
        }

        ArrayList<Integer> ls = new ArrayList<>();
        for (int n = 1; n <= 28123; n++) {
            if (sum[n] > n) ls.add(n);
        }

        boolean[] pos = new boolean[28123 + 1];
        int m = ls.size();

        for (int i = 0; i < m; i++) {
            int a = ls.get(i);
            for (int j = i; j < m; j++) {
                int s = a + ls.get(j);
                if (s > 28123) break;
                pos[s] = true;
            }
        }

        long ans = 0;
        for (int n = 1; n <= 28123; n++) {
            if (!pos[n]) ans += n;
        }

        System.out.println(ans);
    }
}