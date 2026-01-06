package org.example;

// project Euler 4
public class Main {
    public static void main(String[] args) {

        int symmetry = 0;

        for(int i = 999; i > 100; i--){
            for(int j = i; j > 100; j--){
                if(i * j < symmetry) break;
                if(isSymmetry(i * j)) symmetry = Math.max(i * j, symmetry);
            }
        }

        System.out.println(symmetry);
    }

    public static boolean isSymmetry(int n) {
        String num = Integer.toString(n);

        for(int i = 0; i < num.length()/2; i++){
            if(num.charAt(i) != num.charAt(num.length()-1-i))return false;
        }
        return true;
    }
}