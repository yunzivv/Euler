package org.example;

// project Euler 9
public class Main {
    public static void main(String[] args) {

        int a = 1;

        for(a = 1; a <= 400; a++){
            for(int b = a + 1; b <= 400; b++){
                double c = Math.sqrt(Math.pow(a, 2l) + Math.pow(b, 2l));
                if(c % 1 == 0 && a + b + c == 1000) {
                    System.out.println(a * b * c);
                    System.out.println("a: " + a +  " b: " + b + " c: " + c);
                    return;
                }
            }
        }

    }
}