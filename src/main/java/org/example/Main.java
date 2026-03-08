package org.example;
// Baekjoon

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for(int i = n - 1; i >= 0; i--) {
            int sum = i;
            int tmp = i;

            while(tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            if(n == sum) ans = i;
        }

        System.out.println(ans);
    }
}
