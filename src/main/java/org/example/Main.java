package org.example;

// project Euler 19
public class Main {
    public static void main(String[] args) {

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        int sunday = 0;
        for(int i = 1900; i < 2001; i++){
            days[1] = ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) ? 29 : 28;

            for(int j = 0; j < 12; j++){
                if (i >= 1901 && sum % 7 == 6) sunday++;
                sum = sum + days[j];
            }
        }

        System.out.println(sunday);
    }
}