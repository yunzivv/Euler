package org.example;

// Euler 59

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Euler {
    public static void main(String[] args) throws IOException {

        int answer = 0;

        String password = Files.readString(Path.of("text.txt"));
        String[] split = password.split(",");
        int[] letter = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            letter[i] = Integer.parseInt(split[i].trim());
        }

        for (char a = 'a'; a <= 'z'; a++) {
            for (char b = 'a'; b <= 'z'; b++) {
                for (char c = 'a'; c <= 'z'; c++) {

                    char[] key = {a, b, c};
                    StringBuilder decoded = new StringBuilder();

                    for (int i = 0; i < letter.length; i++) {
                        char ch = (char)(letter[i] ^ key[i % 3]);
                        decoded.append(ch);
                    }

                    String res = decoded.toString();

                    if (res.contains(" the ")) {
                        System.out.println("" + a + b + c);
                        for(char r : res.toCharArray()){
                            answer += r;
                        }
                        System.out.println(answer);
                        return;
                    }
                }
            }
        }

    }
}