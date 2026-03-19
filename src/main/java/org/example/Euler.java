package org.example;


// project Euler 46
public class Euler {
    public static void main(String[] args) {

        int answer = 0;
        int n = 0;

        int[] primes = new int[1000];

        for(int i = 2; i < 10000; i++){
            if(n == 1000) break;
            if(Util.isPrime(i)) primes[n++] = i;
        }

        n = 35;

        while(true){
            n += 2;
            boolean ok = true;
            if(Util.isPrime(n)) continue;

            for(int i = 0; i < 1000; i++){
                if(n <= primes[i]) break;

                double m = Math.sqrt((n - primes[i]) / 2.0);
                if(m % 1 == 0) {
                    ok = false;
                    break;
                }
            }
            if(ok) {
                System.out.println(n);
                break;
            }
        }

//        System.out.println(answer);

    }
}