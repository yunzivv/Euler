package org.example;

import java.util.HashMap;

// project Euler 26
public class Euler {
    public static void main(String[] args) {

        int maxLength = 0;
        int answer = 0;

        for (int d = 2; d < 1000; d++) {

            HashMap<Integer, Integer> map = new HashMap<>();
            int remainder = 1 % d;
            int position = 0;

            while (remainder != 0 && !map.containsKey(remainder)) {
                map.put(remainder, position);
                remainder = (remainder * 10) % d;
                position++;
            }

            if (remainder != 0) {
                int cycleLength = position - map.get(remainder);

                if (cycleLength > maxLength) {
                    maxLength = cycleLength;
                    answer = d;
                }
            }
        }

        System.out.println(answer);
    }
}