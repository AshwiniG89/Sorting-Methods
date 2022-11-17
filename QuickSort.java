package com.sorting;

public class QuickSort {
    // divide array at pivot point ie,   nums<P<nums
    // performance is base on selection of pivot point
    // on avg case it runs with TC of O(n lonn); worst O(n^2)
    public void sorting(int[] nums,int start,int end){

        if(start<end){
            int pivot=partition(nums,start,end);
            sorting(nums,start,pivot-1);
            sorting(nums,pivot+1,end);
        }
    }
    public int partition(int[] a,int start,int end){
        int pivot=a[end];
        int i=start-1;//
        for(int j=start;j<=end-1;j++){
            if(a[j]<pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,end);// moving pivot to right place
        return i+1;// returning pivot for next division
    }
    public void swap(int [] a, int index1,int index2){
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=a[index1];
    }
}
