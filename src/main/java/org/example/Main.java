package org.example;
// Baekjoon


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int sum = 2;
        for(int i = 1; i <= count; i++) sum += sum - 1;
        System.out.println(sum * sum);

    }
}
