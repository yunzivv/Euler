package org.example;

import java.util.Arrays;

public class leetCode {

    public static void main(String[] args) {

        int[] arr = new int[]{7,6,4,4};

        int[][] arr2 = {
                {7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}
        };

        System.out.println(isTrionic(arr));
    }

    public static boolean isTrionic(int[] nums) {

        int n = nums.length - 1;
        if (n < 4) return false;

        int i = 0;

        while (i < n && nums[i] < nums[i + 1]) i++;
        int p = i;
        if (p == 0) return false;
        if (p >= n - 1) return false;

        while (i < n && nums[i] > nums[i + 1]) i++;
        int q = i;
        if (q == p) return false;
        if (q >= n) return false;

        while (i < n && nums[i] < nums[i + 1]) i++;

        return i == n;
    }
}
