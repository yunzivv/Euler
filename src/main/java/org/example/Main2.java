package org.example;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min =  scanner.nextInt();
        int max =  scanner.nextInt();

        int answer = 0;

        for(int i = min; i <= max; i++) {
            if(Math.sqrt(i) % 1 != 0) answer++;
        }

        System.out.println(answer);

    }
}