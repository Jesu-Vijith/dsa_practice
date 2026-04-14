package DynammicProgramming.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_120_Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int maxRow=triangle.size();
        int maxCol=triangle.getLast().size();
        System.out.println(maxRow+" "+maxCol);
        int[][]dp=new int[maxRow][maxCol];
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        for(int[]arr:dp){
            System.out.println(Arrays.toString(arr));
        }
        int ans= minimum(0,0,maxRow,maxCol,triangle,dp);
        for(int[]arr:dp){
            System.out.println(Arrays.toString(arr));
        }
        return ans;
    }

    public int minimum(int row,int col,int maxRow,int maxCol,List<List<Integer>> triangle,int[][]dp ){
        if(row>=maxRow){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int first=minimum(row+1,col,maxRow,maxCol,triangle,dp)+triangle.get(row).get(col);
        int second=Integer.MAX_VALUE;
        if(col+1<triangle.get(row).size())
            second=minimum(row+1,col+1,maxRow,maxCol,triangle,dp)+triangle.get(row).get(col);
        dp[row][col]=Math.min(first,second);
        return dp[row][col];
    }

    public static void main(String[] args) {
        List<List<Integer>>triangle=new ArrayList<>();
        triangle.add(new ArrayList<>(Arrays.asList(2)));
        triangle.add(new ArrayList<>(Arrays.asList(3,4)));
        triangle.add(new ArrayList<>(Arrays.asList(6,5,7)));
        triangle.add(new ArrayList<>(Arrays.asList(4,1,8,3)));
        L_120_Triangle ans=new L_120_Triangle();
        System.out.println(ans.minimumTotal(triangle));
    }
}
