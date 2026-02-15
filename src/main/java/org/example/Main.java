package org.example;
// Baekjoon


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] tri = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
        Arrays.sort(tri);

        if(tri[0] + tri[1] <= tri[2]) System.out.println((tri[0] + tri[1]) * 2 -1);
        else System.out.println(tri[0] + tri[1] + tri[2]);
    }
}
