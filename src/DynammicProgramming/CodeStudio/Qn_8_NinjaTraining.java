package DynammicProgramming.CodeStudio;

import java.util.Arrays;

public class Qn_8_NinjaTraining {
    public static void main(String[] args) {
        Qn_8_NinjaTraining n1=new Qn_8_NinjaTraining();
        int[][] points = {
                {10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}
        };
        int n=3;
        int[][]dp=new int[n][points[0].length+1];
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        System.out.println(n1.ninjaTraining(n-1,points,n-1,dp));
        for (int[]arr:dp){
            System.out.println(Arrays.toString(arr));
        }
    }

    public int ninjaTraining(int n,int[][]points,int last,int[][]dp){
        if(n==0){
            int max=0;
            for(int i=0;i<points.length;i++){
                if(i!=last){
                    max=Math.max(max,points[n][i]);
                }
            }
            return max;
        }
        if(dp[n][last]!=-1)return dp[n][last];
        int max=0;
        for(int i=0;i<points.length;i++){
            if(i!=last){
                if(dp[n][i]!=-1)return dp[n][i];
                int point=points[n][i]+ninjaTraining(n-1,points,i,dp);
                max=Math.max(max,point);
            }
        }
        dp[n][last]=max;
        return max;
    }
}
