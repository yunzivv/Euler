package org.example;

// project Euler 30
public class Euler {
    public static void main(String[] args) {

        int ans = 0;
        int max = 0;

        for (int n = 1; n < 20; n++) {

            double left = Math.pow(10, n - 1);
            double right = n * Math.pow(9, 5);

            if (left <= right) {
                max = n;
            }
        }

        max *= (int)Math.pow(9, 5);

        for(int i = 10; i < max; i++) {
            String s = String.valueOf(i);
            int sum = 0;
            for(char c : s.toCharArray()) {
                sum += (int) Math.pow(c - '0', 5);
            }
            if(sum == i) ans += i;
        }

        System.out.println(ans);
    }
}