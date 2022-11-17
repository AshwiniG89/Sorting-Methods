package com.sorting;

public class SelectionSorting {
    // sorting start with min in the array
    public void sorting(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minimum = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[minimum] > nums[j]) {
                    minimum = j;
                }
            }
            int temp = nums[minimum];
            nums[minimum] = nums[i];
            nums[i] = temp;
        }
    }
}
