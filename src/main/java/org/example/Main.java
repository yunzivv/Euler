package org.example;

// project Euler 12
public class Main {
    public static void main(String[] args) {

        long num = 0;
        int n = 1;

        while (true) {
            num += n;
            n++;

            int count = 0;
            long sqrt = (long)Math.sqrt(num);

            for (long i = 1; i <= sqrt; i++) {
                if (num % i == 0) {
                    count += 2;
                }
            }

            if (sqrt * sqrt == num) {
                count--;
            }

            if (count >= 500) {
                System.out.println(num);
                break;
            }
        }
    }
}