package org.example;

// Euler 58

public class Euler {
    public static void main(String[] args) {

        int n = 1;
        int step = 2;

        int primeCnt = 0;
        int totalCnt = 1;

        while(true){
            for(int i = 0; i < 4; i++){
                n += step;
                if(Util.isPrime(n)) primeCnt++;
            }

            totalCnt += 4;

            double ratio = (double) primeCnt / totalCnt;

            if(ratio < 0.1) break;

            step += 2;
        }

        System.out.println(step + 1);
    }
}