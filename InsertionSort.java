package com.sorting;

public class InsertionSort {
    //sorting by dividing array into sorted and unsorted parts
    public void sorting(int[] nums){
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>current){
                nums[j+1]=nums[j];//shifting lower number to sorted part
                j--;
            }
            nums[j+1]=current;
        }
    }
}
