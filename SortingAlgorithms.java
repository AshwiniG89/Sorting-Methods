package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        //var sort=new com.sorting.BubbleSorting();  // tc=== O(n^2)
        //sort.sorting(nums);

        //var sort=new com.sorting.SelectionSorting();    //tc=== O(n^2)
       // sort.sorting(nums);

        //var sort=new com.sorting.InsertionSort();      //tc=== O(n^2)
        //sort.sorting(nums);

        //var sort=new com.sorting.QuickSort();         //avg==O(nlogn) worst==O(n^2)
        //sort.sorting(nums,0,n-1);

        var sort=new MergeSort();
        sort.sorting(nums,0,n-1);
        System.out.println();
        System.out.println(Arrays.toString(nums));
    }
}
