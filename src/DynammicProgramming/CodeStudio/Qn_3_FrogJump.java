package DynammicProgramming.CodeStudio;

import java.util.Arrays;

public class Qn_3_FrogJump {

//    1.Memoization

    //30 10 60 10 60 50 n=6
    public int frogJump1(int n, int heights[]) {
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return jump(n-1,heights,dp);

    }

    public int jump(int n,int[]heights,int[]dp){
        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];
        int left=Math.abs(heights[n]-heights[n-1])+jump(n-1,heights,dp);
        int right=Integer.MAX_VALUE;
        if(n>1)right=Math.abs(heights[n]-heights[n-2])+jump(n-2,heights,dp);
        dp[n]=Math.min(left,right);
        return dp[n];
    }


//    2.Tabulation
        public int frogJump2(int n,int[]heights){
            if(n==1)return 0;
            int[]dp=new int[n];
            dp[0]=0;
            dp[1]=Math.abs(heights[1]-heights[0]);
            for(int i=2;i<n;i++){
                int first=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
                int second=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
                dp[i]=Math.min(first,second);
            }
            return dp[n-1];
        }

//    3.Space Optimization
    public int frogJump3(int n,int []heights){
        if(n==1)return 0;
        int first=0;
        int second=Math.abs(heights[1]-heights[0]);
        for(int i=2;i<n;i++){
            int temp=Math.min(Math.abs(heights[i]-heights[i-1])+second,Math.abs(heights[i]-heights[i-2])+first);
            first=second;
            second=temp;
        }
        return second;
    }

    public void hey(){
        String name="12345";
        int[]arr=null;
    }

    public int frogJumpk(int n,int[]heights){
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return jump1(n-1,heights,dp,1);
    }

    public int jump1(int n,int[]heights,int[]dp,int k){
        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];
        int val=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(n-i>=0) {
                int temp = Math.abs(heights[n] - heights[n - i]) + jump1(n - i, heights, dp, k);
                val = Math.min(val, temp);
            }
        }
        dp[n]=val;
        return dp[n];
    }

    public static void main(String[] args) {
        int[]heights={30 ,10, 60, 10, 60, 50 };
        int n=6;
        Qn_3_FrogJump jump=new Qn_3_FrogJump();
        System.out.println(jump.frogJump1(n,heights));
        System.out.println(jump.frogJump2(n,heights));
        System.out.println(jump.frogJump3(n,heights));
        System.out.println(jump.frogJumpk(n,heights));
    }
}
