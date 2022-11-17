package com.sorting;

public class MergeSort {
    //divide into least possible ie, individual(sorted) using mid
    //new array creation for divided arrays feed them with elements
    //compare and merge
    // O(nlogn)

    //dividing
    public void sorting(int[] nums, int start,int end) {
        if (start >=end) {return;}
         int mid = (start + end) / 2;
         System.out.println("mid:"+mid);
         sorting(nums, start, mid);
            sorting(nums, mid + 1, end);
            merge(nums, start, mid, end);

    }
    //merging
    public void merge(int[]nums,int left,int mid,int right){
       int[] mergea=new int[right-left+1];
       //compare two array
        int i=left;
        int j=mid+1; int k=0;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                mergea[k]=nums[i];
                i++;
            }else{
                mergea[k]=nums[j];
                j++;
            }
            k++;
        }
        /// if n1 and n2 are not equal then to copy all elements
        while(i<=mid){
            mergea[k]=nums[i];
            i++;
            k++;
        }
        while(j<=right){
            mergea[k]=nums[j];
            j++;
            k++;
        }
        for(int m=0,l=left;m<mergea.length;m++,l++){
            nums[l] = mergea[m];
        }
    }
}
