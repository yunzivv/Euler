package org.example;
// Baekjoon


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int sum = 0;
        int k = 0;

        while (sum < X) {
            k++;
            sum += k;
        }

        int pos = X - (sum - k);

        int num, den;
        if (k % 2 != 0) {
            num = k - pos + 1;
            den = pos;
        } else {
            num = pos;
            den = k - pos + 1;
        }

        System.out.println(num + "/" + den);
    }
}
