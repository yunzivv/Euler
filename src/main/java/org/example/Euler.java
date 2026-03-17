package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

// project Euler 42
public class Euler {
    public static void main(String[] args) throws IOException {

        int answer = 0;

        Set<Integer> set = new HashSet<>();
        int n = 1;
        for(int i = 2; i < 100; i++){
            set.add(n);
            n += i;
        }

        String content = Files.readString(Paths.get("words.txt"));
        String[] words = content.replace("\"", "").split(",");

        for (String w : words) {
            n = 0;
            for(char c : w.toCharArray()){
                n += c - 'A' + 1;
            }
            if(set.contains(n)) answer++;
        }

        System.out.println(answer);
    }
}