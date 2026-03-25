package org.example;

// Euler 55

public class Euler {
    public static void main(String[] args) {

        int answer = 0;

        for(long i = 1; i < 10_000; i++){

            long n = i;
            boolean ok = true;

            for(int j = 0; j < 50; j++){
                n += (getReverseNum(n));
                if(isPalindrome(n)){
                    ok = false;
                    break;
                }
            }

            if(ok) answer++;
        }

        System.out.println(answer);
    }

    static long getReverseNum (long n){
        long answer = 0;
        while(n > 0){
            answer = answer * 10 + n % 10;
            n = n / 10;
        }

        return answer;
    }

    static boolean isPalindrome (long n){
        String s = String.valueOf(n);
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }

        return true;
    }
}