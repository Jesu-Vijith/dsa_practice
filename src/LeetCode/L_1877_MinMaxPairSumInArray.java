package LeetCode;

import java.util.Arrays;

public class L_1877_MinMaxPairSumInArray {
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            max=Math.max(max,nums[left]+nums[right]);
            left++;
            right--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[]nums={3,5,4,2,4,6};
        System.out.println(minPairSum(nums));
    }
}
