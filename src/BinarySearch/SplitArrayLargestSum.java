package BinarySearch;

import java.util.Arrays;

public class SplitArrayLargestSum {

     public static int[] minMaxPossibility(int[]nums){
         int min=0;
         int max=0;
        for(int num:nums){
            if(num>min){
                min=num;
            }
            max=max+num;
        }
        return new int[]{min,max};
     }

     public static int findingAns(int start,int end, int k,int[]nums){
         int mid=0;
        while(start<end){
//             if(start==mid && mid==end){
//                 break;
//             }
             mid=(start+end)/2;
             int temp=0;
             int pieces=0;
             for(int i=0;i<nums.length;i++){
                temp=temp+nums[i];
                if(temp>mid) {
                    pieces++;
                    temp=nums[i];
                }

             }
             pieces++;
             if(pieces<=k){
                 end=mid;
             }
             else{
                 start=mid+1;
             }
         }
         return start;
     }

    public static void main(String[] args) {
        int[]nums={7,2,5,10,8};
        int k=2;
        int[]minMax=minMaxPossibility(nums);
        int start=minMax[0];
        int end=minMax[1];
        System.out.println(findingAns(start,end,k,nums));
    }

}
