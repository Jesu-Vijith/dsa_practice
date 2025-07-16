package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[]nums,int start,int end){
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
                }
        }
    }

    public static void main(String[] args) {
        int[]nums={5,3,4,1,2};
        for(int i=0;i<nums.length-1;i++){
            int start=0;
            int end=i+1;
            insertionSort(nums,start,end);
        }
        System.out.println(Arrays.toString(nums));
    }
}
