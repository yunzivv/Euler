package org.example;

import java.util.*;

public class Programmers {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1};

        int[][] arr2 = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};

        int[] fees =  new int[]{180, 5000, 10, 600};
        String[] strings = new String[]{"05:34 5961 IN", "06:00 0000 IN",
                "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
                "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        int n = solution(10, 40, 5);
        System.out.println(n);

    }

    static int solution(int x, int y, int n) {
        int answer = 1;

        Queue<Integer> q = new LinkedList<>();
        q.add(x);

        while(true){
            x = q.poll();

            if(x == y) break;
            if(x > y) return -1;

            q.add(x * 2);
            q.add(x * 3);
            q.add(x + n);

            answer++;
        }

        return answer / 3;
    }

    public static int usage(String out, String in) {

        int h = Integer.parseInt(out.substring(0, 2)) - Integer.parseInt(in.substring(0, 2));
        return (h * 60) + Integer.parseInt(out.substring(3, 5)) - Integer.parseInt(in.substring(3, 5)); // total
    }

}