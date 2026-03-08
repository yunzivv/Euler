package org.example;

import java.util.Arrays;

public class leetCode {

    public static void main(String[] args) {

        int[] arr = new int[]{2,7,11,15};

        String[] arr2 = {"00","01"};

        System.out.println(twoSum(arr, 9));
    }

    public static int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }
}
