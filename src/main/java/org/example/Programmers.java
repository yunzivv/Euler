package org.example;

import java.util.*;

import static org.example.Util.isPrime;

public class Programmers {
    public static void main(String[] args) {
        int[][] routes = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };

        System.out.println(solution(routes));
    }

    public static int solution(int[][] maps) {
        int answer = 0;

        int height = maps.length;
        int width = maps[0].length;

        boolean[][] used = new boolean[height][width];
        Queue<int[]> unused = new LinkedList<>();
        Map<Integer, Integer> parent = new HashMap<>();

        int[][] way = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        boolean find = false;

        unused.add(new int[]{0, 0});
        used[0][0] = true;

        while (!unused.isEmpty()) {
            int[] now = unused.poll();

            for (int i = 0; i < 4; i++) {
                int x = now[0] + way[i][0];
                int y = now[1] + way[i][1];

                if (x >= 0 && x < height
                        && y >= 0 && y < width
                        && maps[x][y] == 1) {
                    if (!used[x][y]) {
                        used[x][y] = true;
                        int[] next = new int[]{x, y};
                        unused.add(next);
                        parent.put(x * width + y, now[0] * width + now[1]);
                    }

                }

                if (x == height - 1 && y == width - 1) {
                    find = true;
                    break;
                }
            }

            if (find) break;
        }

        int now = width * height - 1;
        while (now != 0) {
            if(parent.get(now) == null) return -1;
            answer++;
            now = parent.get(now);
        }

        return answer + 1;
    }

}