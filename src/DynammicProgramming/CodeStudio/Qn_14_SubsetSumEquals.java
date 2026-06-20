package DynammicProgramming.CodeStudio;

import java.util.Arrays;

public class Qn_14_SubsetSumEquals {
    public static boolean subsetSumToK(int n, int k, int[]arr){
        Boolean[]dp=new Boolean[n];
        return subSet(arr,k,n,0,0,dp);
    }

//    public static boolean subSet(int[]arr,int k,int n,int idx,int total,Boolean[]dp){
//        if(total==k)return true;
//        if(idx==n)return false;
//        if(dp[idx]!=null && dp[idx])return true;
//        boolean first=subSet(arr,k,n,idx+1,total+arr[idx],dp);
//        boolean second=subSet(arr,k,n,idx+1,total,dp);
//        dp[idx]= first || second;
//        return first || second;
//    }

    public static boolean subSet(int[]arr,int k,int n,int idx,int total,Boolean[]dp){
        if(total==k)return true;
        if(idx==n)return false;
        if(dp[idx]!=null && dp[idx])return true;
        boolean first=subSet(arr,k,n,idx+1,total+arr[idx],dp);
        boolean second=subSet(arr,k,n,idx+1,total,dp);
        return dp[idx]= first || second;
    }

    public static void main(String[] args) {
        int[]arr={6,1,2,1};
        int n=4,k=4;
        System.out.println(subsetSumToK(n,k,arr));
    }

}

