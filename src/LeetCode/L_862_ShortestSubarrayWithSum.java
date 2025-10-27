package LeetCode;

import java.util.*;

public class L_862_ShortestSubarrayWithSum {
//    public int shortestSubarray(int[] nums, int k) {
//        int min=Integer.MAX_VALUE;
//        int left=0;
//        int total=0;
//        for(int right=0;right<nums.length;right++){
//            if(nums[right]==k){
//                return 1;
//            }
//            total+=nums[right];
//            while(total>=k){
//                min=Math.min(min,right-left+1);
//                total-=nums[left++];
//            }
//        }
//        return min==Integer.MAX_VALUE?-1:min;
//    }

    public int shortestSubarray(int[]nums,int k){
        Deque<Integer> deque=new LinkedList<>();
        int[]prefixArr=getPrefixArr(nums);
        int output=Integer.MAX_VALUE;
        for(int i=1;i<prefixArr.length;i++){
            while(!deque.isEmpty() && prefixArr[i]-prefixArr[deque.peekFirst()]>=k){
                output=Math.min(output,i-deque.pollFirst());
            }
            while(!deque.isEmpty() && prefixArr[deque.peekLast()]>prefixArr[i]){
                deque.pollLast();
            }
            deque.add(i);
        }
        return output==Integer.MAX_VALUE?-1:output;
    }

    public int[] getPrefixArr(int[]nums){
        int[]prefixArr=new int[nums.length+1];
        for(int i=1;i<prefixArr.length;i++){
            prefixArr[i]=prefixArr[i-1]+nums[i-1];
        }
        System.out.println(Arrays.toString(prefixArr));
        return prefixArr;
    }

    public static void main(String[] args) {
        int[]nums={2,-1,-5,5,1,1};
        int k=3;
        L_862_ShortestSubarrayWithSum ans=new L_862_ShortestSubarrayWithSum();
        System.out.println(ans.shortestSubarray(nums,k));
    }
}
