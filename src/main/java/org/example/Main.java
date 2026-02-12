package org.example;
// Baekjoon


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            if(n == -1) break;

            StringBuffer sb = new StringBuffer(n + " = 1");
            int sum = 1;

            for(int i = n - 1; i > 1; i--) {
                if(n % i == 0) {
                    sb.append(" + " + n / i);
                    sum += i;
                }
            }
            if(n == sum) System.out.println(sb.toString());
            else System.out.println(n + " is NOT perfect.");
        }
    }
}
