package org.example;


import java.util.*;

// project Euler 48
public class Euler {
    public static void main(String[] args) {

        List<Integer> primes = new ArrayList<>();
        for (int i = 1235; i < 10000; i += 2) {
            if (Util.isPrime(i)) {
                primes.add(i);
            }
        }

        // 순열 기준으로 그룹 묶기
        Map<String, List<Integer>> map = new HashMap<>();

        for (int num : primes) {
            char[] arr = String.valueOf(num).toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(num);
        }

        // 각 그룹에서 등차수열 찾기
        for (List<Integer> group : map.values()) {

            if (group.size() < 3) continue;

            Collections.sort(group);

            int size = group.size();

            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {

                    int a = group.get(i);
                    int b = group.get(j);
                    int c = 2 * b - a;

                    if (group.contains(c)) {
                        if (a == 1487 && b == 4817) continue;

                        System.out.println("" + a + b + c);
                    }
                }
            }
        }

    }

}