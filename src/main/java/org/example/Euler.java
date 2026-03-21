package org.example;

import java.util.*;

public class Euler {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // 소수 리스트
        list.add(2);
        for (int i = 3; i < 1000000; i += 2) {
            if (Util.isPrime(i)) {
                list.add(i);
            }
        }

        int answer = 0;
        int len = 0;

        for (int start = 0; start < list.size(); start++) {

            int sum = 0;

            // end 늘려가면서 합 구하기
            for (int end = start; end < list.size(); end++) {

                sum += list.get(end);
                if (sum >= 1000000) break;

                // 소수 + 길이 체크
                if (Util.isPrime(sum)) {
                    int curLen = end - start + 1;

                    if (curLen > len) {
                        len = curLen;
                        answer = sum;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}