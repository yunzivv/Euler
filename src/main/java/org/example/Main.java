package org.example;

// project Euler 5
public class Main {
    public static void main(String[] args) {

        int num = 20;
        int n = 2520;

        while(true){

            for(num = 20; num > 0; num--) {
                if(n % num != 0) break;
            }
            if(num == 0) break;

            n++;
        }

        System.out.println(n);
    }

}