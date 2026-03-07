package org.example;
// Baekjoon

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();

        for(int i = 0; i < n; i++) set.add(sc.next());

        String[] arr = set.toArray(new String[set.size()]);
        Arrays.sort(arr);
        Arrays.sort(arr, (a, b) ->
                a.length() - b.length()
        );

        for(String s : arr) System.out.println(s);
    }
}
