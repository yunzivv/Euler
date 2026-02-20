package org.example;

import java.util.ArrayList;
import java.util.Arrays;

// project Euler 24
public class Euler {
    public static void main(String[] args) {

        int[] fac = {362880, 40320, 5040, 720, 120, 24, 6, 2, 1, 1};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        int idx = 1000000 -1;
        String s = "";

        for(int i : fac){
            s += list.remove(idx / i);
            idx %= i;
        }

        System.out.println(s);
    }
}