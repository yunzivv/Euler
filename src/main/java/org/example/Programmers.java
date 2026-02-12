package org.example;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;

import static org.example.Util.isPrime;

public class Programmers {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1};

        int[][] arr2 = {
                {1, 1, 0, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 1, 1, 1}
        };

        String[] strings = new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};

        Function<Integer, String> submit = makeSubmit(2593);
        System.out.println(solution(strings));

//        for(int i : solution(strings)){
//            System.out.println(i);
//        }
    }

    public static String[] solution(String[] files) {
        String[] answer = new String[files.length];

        Map<String, Integer> map = new HashMap<>();
        String[] heads = new String[files.length];

        int idx = 0;

        for(String s : files){
            int step = 0;
            String head = "", number = "", tail = "";

            for(char c : s.toCharArray()){
                if(!Character.isDigit(c) && step == 0) head += c + "";
                else if((!Character.isDigit(c) && step == 1) || step == 2) {
                    step = 2;
                    tail += c + "";
                } else {
                    step = 1;
                    number += c + "";
                }
            }
            heads[idx] = head.toLowerCase();
            map.put(head, idx);
            map.put(number, idx);
            map.put(tail, idx++);
        }

        System.out.println(map.keySet());

        return answer;
    }

    private static String baseball(String target, String answer) {

        int strike = 0;
        int ball = 0;

        for(int i = 0; i < 4; i++){
            if(target.charAt(i) == answer.charAt(i)) {
                strike++;
                continue;
            }
            if(target.contains(answer.charAt(i) +"")) ball++;
        }

        return strike + "S " + ball + "B";
    }



    private static Function<Integer, String> makeSubmit(int secret) {
        final String s = String.format("%04d", secret); // 혹시 0 포함 테스트도 가능하게 4자리 고정

        return (Integer guess) -> {
            String g = String.format("%04d", guess);

            int strikes = 0;
            int balls = 0;

            // strike 계산
            for (int i = 0; i < 4; i++) {
                if (g.charAt(i) == s.charAt(i)) strikes++;
            }

            // ball 계산 (자릿수별 중복까지 안전하게 세는 방식)
            int[] cntS = new int[10];
            int[] cntG = new int[10];

            for (int i = 0; i < 4; i++) {
                if (g.charAt(i) != s.charAt(i)) { // strike 제외한 것만 카운트
                    cntS[s.charAt(i) - '0']++;
                    cntG[g.charAt(i) - '0']++;
                }
            }

            for (int d = 0; d < 10; d++) {
                balls += Math.min(cntS[d], cntG[d]);
            }

            return strikes + "S " + balls + "B";
        };
    }

}