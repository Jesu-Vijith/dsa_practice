package DynammicProgramming.Leetcode;

import java.util.Arrays;

public class L_70_ClimbingStairs {
    public int climbStairs(int n) {
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return climb(n,dp);
    }
    public int climb(int n,int[]dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=climb(n-1,dp)+climb(n-2,dp);
        return dp[n];
    }

    public static void main(String[] args) {
        L_70_ClimbingStairs stairs=new L_70_ClimbingStairs();
        int n = 7;
        System.out.println(stairs.climbStairs(n));
    }
}
