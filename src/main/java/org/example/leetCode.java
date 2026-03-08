package org.example;

import java.util.Arrays;

public class leetCode {

    public static void main(String[] args) {

        int[] arr = new int[]{7,6,4,4};

        String[] arr2 = {"00","01"};

        System.out.println(findDifferentBinaryString(arr2));
    }

    public static String findDifferentBinaryString(String[] nums) {

        int len = nums[0].length();
        String s = "";

        for(int i = 0; i < 17; i++){
            s = String.format("%" + len + "s", Integer.toBinaryString(i)).replace(' ', '0');
            boolean exist = false;

            for(String n : nums) {
                if (n.equals(s)) {
                    exist = true;
                    break;
                }
            }

            if(!exist){
                return s;
            }
        }
        return null;
    }
}
