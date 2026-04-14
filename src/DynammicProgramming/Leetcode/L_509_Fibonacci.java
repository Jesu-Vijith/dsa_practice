package DynammicProgramming.Leetcode;

import java.util.Arrays;

public class L_509_Fibonacci {
    public int fibonacciMemoization(int n,int[]dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=fibonacciMemoization(n-1,dp)+fibonacciMemoization(n-2,dp);
        return dp[n];
    }

    public int fibonacciTabulation(int n){
        if(n<=1)return n;
        int[]dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public int fibonacciSpaceOptimization(int n){
        if(n<=1)return n;
        int first=0;
        int second=1;
        for(int i=2;i<=n;i++){
            int temp=first+second;
            first=second;
            second=temp;
        }
        return second;
    }


    public static void main(String[] args) {
        L_509_Fibonacci f1=new L_509_Fibonacci();
        int n=10;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(f1.fibonacciMemoization(n,dp));
        System.out.println(f1.fibonacciTabulation(n));
        System.out.println(f1.fibonacciSpaceOptimization(n));
    }
}
