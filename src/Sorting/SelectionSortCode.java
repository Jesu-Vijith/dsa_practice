package Sorting;

import java.util.Arrays;

public class SelectionSortCode {

    public static void selectionSort(int[]nums){
        for(int i=0;i<nums.length-1;i++){
            boolean swap=false;
            int min=nums[i];
            int index=0;
            for(int j=i+1;j<nums.length;j++){
                if(min>nums[j]){
                    min=nums[j];
                    index=j;
                    swap=true;
                }
            }
            if(swap){
                int temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
            }

        }
    }

    public static void main(String[] args) {
        int[]nums={2,-32,0,78,1 };
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
