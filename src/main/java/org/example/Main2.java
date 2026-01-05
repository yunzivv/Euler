package org.example;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

//        Scanner in=new Scanner(System.in);
//
//        while(in.hasNextInt()){
//
//            int a=in.nextInt();
//            int b=in.nextInt();
//            System.out.println(a+b);
//
//        }
//        in.close();

        System.out.println(solution("LULLLLLLU"));
    }

    public static int solution(String dirs) {
        int answer = 0;
        int x = 5;
        int y = 5;

        String[][] map = new String[11][11];
        for(String[] m : map) Arrays.fill(m, "");

        for(char c : dirs.toCharArray()){
            if(!map[y][x].contains("" + c)) answer++;
            map[y][x] += c;
            if(c == 'U') y = Math.max(0, y - 1);
            else if(c == 'D') y = Math.min(10, y + 1);
            else if(c == 'L') x = Math.max(0, x - 1);
            else if(c == 'R') x = Math.min(10, x + 1);
        }

        return answer;
    }
}