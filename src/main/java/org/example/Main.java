package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// project Euler 3
public class Main {
    public static void main(String[] args) {

        long num = 600851475143l;
        long prime = 3;

        while(prime < num) {
            if(num % prime == 0) num /= prime;
            else prime++;
        }

        System.out.println("biggest prime: " + prime);
    }
}