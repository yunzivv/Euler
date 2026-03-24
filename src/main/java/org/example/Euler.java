package org.example;

// Euler 54

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Euler {
    public static void main(String[] args) throws FileNotFoundException {

        int answer = 0;

        Scanner sc = new Scanner(new File("text.txt"));

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String player1 = s.substring(0, 14);
            String player2 = s.substring(15);

            int[] p1 = pocker(player1);
            int[] p2 = pocker(player2);

            if (compare(p1, p2) > 0) answer++;
        }

        System.out.println(answer);
    }

    static int compare(int[] a, int[] b) {
        int len = Math.max(a.length, b.length);

        for (int i = 0; i < len; i++) {
            int x = i < a.length ? a[i] : 0;
            int y = i < b.length ? b[i] : 0;

            if (x != y) return x - y;
        }
        return 0;
    }

    static int[] pocker(String s){
        String[] cards = s.split(" ");

        Map<Integer,Integer> map = new HashMap<>();
        int[] nums = new int[5];
        int[] shapes = new int[5];

        for(int i = 0; i < 5; i++) {
            char c = cards[i].charAt(0);
            int n = c == 'A' ? 14 : c == 'T' ? 10 : c == 'J' ? 11 : c == 'Q' ? 12 : c == 'K' ? 13 : c - '0';

            map.put(n, map.getOrDefault(n, 0) + 1);

            nums[i] = n;
            shapes[i] = cards[i].charAt(1) - 'A';
        }

        Arrays.sort(nums); Arrays.sort(shapes);

        boolean isStraight = true, isFlush = true;

        // Straight
        for(int i = 0; i < 4; i++) if(nums[i] != nums[i + 1] - 1) isStraight = false;
        if (nums[0] == 2 && nums[1] == 3 && nums[2] == 4 && nums[3] == 5 && nums[4] == 14) isStraight = true;
        // Flush
        for(int i = 0; i < 4; i++) if(shapes[i] != shapes[i + 1]) isFlush = false;

        // Royal Flush : Straight Flush
        if (isStraight && isFlush) {
            int high = (nums[0] == 2 && nums[4] == 14) ? 5 : nums[4];
            return new int[]{nums[4] == 14 ? 9 : 8, high};
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());

        // Four of a Kind
        if (list.equals(Arrays.asList(4, 1))) {
            int four = 0, other = 0;

            for (int key : map.keySet()) {
                if (map.get(key) == 4) four = key;
                else other = key;
            }

            return new int[]{7, four, other};

        } // Full House
        else if(list.equals(Arrays.asList(3, 2))){
            int triple = 0, pair = 0;

            for (int key : map.keySet()) {
                if (map.get(key) == 3) triple = key;
                else pair = key;
            }

            return new int[]{6, triple, pair};

        // flush
        } else if (isFlush) {
            int[] res = new int[6];
            res[0] = 5;

            for (int i = 0; i < 5; i++) {
                res[i + 1] = nums[4 - i];
            }

            return res;

        } // straight
        else if (isStraight) {
            return new int[]{4, nums[0] == 2 ? 5 : nums[4]};
        }
        // Three of a Kind
        else if(list.equals(Arrays.asList(3, 1, 1))){
            int triple = 0;
            List<Integer> rest = new ArrayList<>();

            for (int key : map.keySet()) {
                if (map.get(key) == 3) triple = key;
                else rest.add(key);
            }

            Collections.sort(rest, Collections.reverseOrder());

            return new int[]{3, triple, rest.get(0), rest.get(1)};

        } // Two Pair
        else if(list.equals(Arrays.asList(2, 2, 1))){
            List<Integer> pairs = new ArrayList<>();
            int other = 0;

            for (int key : map.keySet()) {
                if (map.get(key) == 2) pairs.add(key);
                else other = key;
            }

            Collections.sort(pairs, Collections.reverseOrder());

            return new int[]{2, pairs.get(0), pairs.get(1), other};

        } // One Pair
        else if(list.equals(Arrays.asList(2, 1, 1, 1))){
            int pair = 0;
            List<Integer> rest = new ArrayList<>();

            for (int key : map.keySet()) {
                if (map.get(key) == 2) pair = key;
                else rest.add(key);
            }

            Collections.sort(rest, Collections.reverseOrder());

            return new int[]{1, pair, rest.get(0), rest.get(1), rest.get(2)};

        } // High Card
        else{
            int[] res = new int[6];
            res[0] = 0;

            for (int i = 0; i < 5; i++) {
                res[i + 1] = nums[4 - i];
            }

            return res;
        }
    }

}