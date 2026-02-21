package org.example;

import java.util.ArrayList;
import java.util.Arrays;

// project Euler 28
public class Euler {
    public static void main(String[] args) {

        int n = 1;
        int step = 1;
        int cycle = 2;

        for(int i = 1; i < 1001; i += 2){
            for(int j = 0; j < 4; j++) {
                step += cycle;
                n += step;
            }
            cycle += 2;
        }
        System.out.println(n);
    }
}