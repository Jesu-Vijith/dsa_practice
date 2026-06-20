package LeetCode;

import java.util.Arrays;

public class L_931_MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int target=Integer.MAX_VALUE;
        int[][]track=new int[matrix.length][matrix[0].length];
        for(int[]elem:track)Arrays.fill(elem,10000);
        for(int col=0;col<matrix[0].length;col++){
            target=Math.min(target,minimum(matrix,0,col,matrix.length,track));
            for(int[]arr:track){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("====================");
        }
        return target;
    }


    public int minimum(int[][]matrix,int row,int col,int n,int[][]track){
        if(row==n)return 0;
        if(col<0 || col>=n)return 2000000000;
        if(track[row][col]!=10000){
            return track[row][col];
        }
        int t1=matrix[row][col]+minimum(matrix,row+1,col-1,n,track);
        int t2=matrix[row][col]+minimum(matrix,row+1,col,n,track);
        int t3=matrix[row][col]+minimum(matrix,row+1,col+1,n,track);

        int target=Math.min(t1,t2);
        target=Math.min(target,t3);
        track[row][col]=target;
        return target;
    }

    public static void main(String[] args) {
        L_931_MinimumFallingPathSum l1=new L_931_MinimumFallingPathSum();
        int[][]matrix={{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(l1.minFallingPathSum(matrix));
    }
}
