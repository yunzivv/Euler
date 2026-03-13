package org.example;

// project Euler 39
public class Euler {
    public static void main(String[] args) {

        int answer = 0;
        int maxCnt = 0;

        for (int l = 12; l <= 1000; l++) {
            int cnt = 0;

            for(int a = 1; a <= l/3; a++){
                for(int b = 1; b <= l/2; b++){
                    int c = l - a - b;
                    if(Math.pow(c, 2) == a * a + b * b) cnt++;
                }
            }

            if(maxCnt < cnt){
                answer = l;
                maxCnt = cnt;
            }
        }

        System.out.println(answer);
    }
}