package org.example;

import java.util.HashSet;
import java.util.Set;

// project Euler 38
public class Euler {
    public static void main(String[] args) {

        int answer = 0;

        for(int i = 9; i < 9999; i++){

            String s = "";
            int[] alpha = new int[10];
            for(int j = 1; j <= 9; j++){
                s += i * j;
                if(s.length() >= 9) break;
            }

            if(s.length() == 9){
                boolean ok = true;
                for(char c : s.toCharArray()){
                    if(alpha[c - '0'] != 0 || c == '0') {
                        ok = false;
                        break;
                    }
                    alpha[c - '0']++;
                }

                if(ok) answer = Math.max(Integer.parseInt(s), answer);
            }
        }

        System.out.println(answer);
    }
}