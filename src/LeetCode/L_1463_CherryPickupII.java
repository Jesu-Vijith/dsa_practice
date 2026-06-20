package LeetCode;

import java.util.Arrays;

public class L_1463_CherryPickupII {
    public static void main(String[] args) {
        int[][]grid={{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        L_1463_CherryPickupII l1=new L_1463_CherryPickupII();
        int[][][] track=new int[grid.length][grid[0].length][grid[0].length];
        for(int[][]arr:track){
            for(int[]a:arr){
                Arrays.fill(a,Integer.MIN_VALUE);
            }
        }
        System.out.println(l1.pickup(grid,track,0,0,grid[0].length-1));
        for(int[][]arr:track){
            for(int[]a:arr){
                System.out.println(Arrays.toString(a));;
            }
            System.out.println();
            System.out.println();
        }
    }

    public int pickup(int[][]grid,int[][][]track,int row,int robAcol,int robBcol){
        if(row== grid.length || robAcol<0 || robBcol<0 || robAcol> grid[0].length-1 || robBcol> grid[0].length-1)return 0;
        if(track[row][robAcol][robBcol]!=Integer.MIN_VALUE)return track[row][robAcol][robBcol];
        int result=grid[row][robAcol]+grid[row][robBcol];
        int max=0;
        for(int i=robAcol-1;i<=robAcol+1;i++){
            for(int j=robBcol-1;j<=robBcol+1;j++){
                if(i<j){
                    max=Math.max(max,pickup(grid,track,row+1,i,j));
                }
            }
        }
        result+=max;
        return track[row][robAcol][robBcol]=result;
    }
}
