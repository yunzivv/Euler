package org.example;
// Baekjoon

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = n / 5;
        if((n % 5) % 3 != 0) {
            if(n % 3 == 0) System.out.println(n / 3);
            else System.out.println(-1);
        }
        else System.out.println(answer + answer / 3);
    }
}
