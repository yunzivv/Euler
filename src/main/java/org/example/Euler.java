package org.example;

// project Euler 34
public class Euler {
    public static void main(String[] args) {

        int ans = 0;
        int[] facts = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

        for(int i = 3; i < 10000000; i++){
            int sum = 0;
            int t = i;
            while(t > 0){
                sum += facts[t % 10];
                t /= 10;
            }

            if(i == sum) ans += i;
        }

        System.out.println(ans);
    }
}