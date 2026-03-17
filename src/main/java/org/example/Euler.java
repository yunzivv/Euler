package org.example;

// project Euler 36
public class Euler {
    public static void main(String[] args) {

        int answer = 0;

        for(int i = 1; i < 1000000; i++){
            if(isPalindrome(i)) answer += i;
        }

        System.out.println(answer);
    }

    static boolean isPalindrome(int n){

        String ten = Integer.toString(n);
        for(int i = 0; i < ten.length() / 2; i++){
            if(ten.charAt(i) != ten.charAt(ten.length() - 1 - i)) return false;
        }
        String two = Integer.toBinaryString(n);
        for(int i = 0; i < two.length() / 2; i++){
            if(two.charAt(i) != two.charAt(two.length() - 1 - i)) return false;
        }

        return true;
    }

}