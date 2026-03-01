package org.example;

// project Euler 34
public class Euler {
    public static void main(String[] args) {

        int ans = 13;
        for(int i = 100; i < 1_000_000; i++){
            if(isPrime(i)){
                String s = Integer.toString(i);
                boolean cyclePrime = true;
                for (int j = 0; j < s.length(); j++) {
                    s = s.substring(1) + s.charAt(0);
                    if(!isPrime(Integer.parseInt(s))) {
                        cyclePrime = false;
                        break;
                    }
                }

                if(cyclePrime) ans++;
            }
        }

        System.out.println(ans);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}