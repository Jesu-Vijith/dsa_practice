import java.util.*;

public class Dummy {

    public int frogJump(int n, int heights[]) {
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return jump(n-1,dp,heights);
    }

    public int jump(int n,int[]dp,int[]heights){
        if(n==0){
            return heights[0];
        }
        if(n<0){
            return Integer.MAX_VALUE;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=Math.min(Math.abs(heights[n]-jump(n-1,dp,heights)),Math.abs(heights[n]-jump(n-2,dp,heights)));
        return dp[n];
    }

    public static void main(String[] args) {
        int[]heights={10,20,30,10};
        int n=4;
        Dummy d1=new Dummy();
        System.out.println(d1.frogJump(n,heights));
    }
}