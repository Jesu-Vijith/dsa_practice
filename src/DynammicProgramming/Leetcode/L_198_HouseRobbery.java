package DynammicProgramming.Leetcode;

import java.util.Arrays;

public class L_198_HouseRobbery {
    public int rob(int[] nums) {
       int[] memo = new int[nums.length + 1];
        Arrays.fill(memo, -1);
        return rob(nums, nums.length - 1,memo);
    }

    private int rob(int[] nums, int i,int[]memo) {
        if (i < 0) {
            return 0;
        }
        if (memo[i] >= 0) {
            return memo[i];
        }
        int result = Math.max(rob(nums, i - 1,memo),rob(nums, i - 2,memo) + nums[i]);
        memo[i] = result;
        return result;
    }

    public int rob2(int[]nums){
        int[]dp=new int[nums.length];
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        L_198_HouseRobbery s1=new L_198_HouseRobbery();
        int[]arr={2,1,1,2};
        System.out.println(s1.rob2(arr));
    }
}
