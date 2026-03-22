package org.example;

import java.util.*;

public class Euler {
    public static void main(String[] args) {

        int answer = 123;

        while(true){
            answer++;

            // 1-6배의 각 자리 수를 담을 배열
            char[][] nums = new char[6][String.valueOf(answer).length()];

            for(int i = 1; i <= 6; i++){
                nums[i - 1] = String.valueOf(answer * i).toCharArray();
                // 정렬
                Arrays.sort(nums[i - 1]);
            }

            // 정렬 후 같은 숫자로 이루어지는 지 확인
            boolean ok = false;
            for(int i = 0; i < String.valueOf(answer).length(); i++){
                if(nums[0][i] != nums[1][i] || nums[2][i] != nums[3][i] || nums[4][i] != nums[5][i]
                || nums[0][i] != nums[2][i] || nums[0][i] != nums[4][i]){
                    ok = true;
                    break;
                }
            }

            if(!ok) break;
        }

        System.out.println(answer);
    }
}