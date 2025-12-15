package org.example;

// project Euler 2
public class Main {
    public static void main(String[] args) {

        int before = 1;
        int fivo = 1;
        int sum = 0;

        while(fivo <= 4000000){
            fivo += before;
            before = fivo - before;
            if(fivo % 2 == 0) sum += fivo;
        }

        System.out.println(sum);
    }
}