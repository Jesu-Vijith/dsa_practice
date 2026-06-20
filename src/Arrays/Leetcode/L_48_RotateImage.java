package Arrays.Leetcode;

import java.util.Arrays;

public class L_48_RotateImage {

//    Method-1 (4 - way swapping)
    //My own try as well
    public void rotate(int[][]matrix){
        int rowLimit=0;
        int colLimit=matrix[0].length-1;
        while(rowLimit<colLimit){
            for(int idx=0; idx<colLimit-rowLimit; idx++){
                int a=matrix[rowLimit][rowLimit+idx];
                int b=matrix[rowLimit+idx][colLimit];
                int c=matrix[colLimit][colLimit-idx];
                int d=matrix[colLimit-idx][rowLimit];

                matrix[rowLimit][rowLimit+idx]=d;
                matrix[rowLimit+idx][colLimit]=a;
                matrix[colLimit][colLimit-idx]=b;
                matrix[colLimit-idx][rowLimit]=c;
            }
            rowLimit++;
            colLimit--;
        }
    }

//    Method-2 (Vertical reversal and matrix transpose)
    public void rotate1(int[][]matrix){
        int start=0;
        int end=matrix.length-1;

        //Vertical Reversal
        while(start<end){
            for(int i=0;i<matrix[0].length;i++){
                int temp=matrix[start][i];
                matrix[start][i]=matrix[end][i];
                matrix[end][i]=temp;
            }
            start++;end--;
        }

        for(int[]arr:matrix) System.out.println(Arrays.toString(arr));


//        Matrix Transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }

    public static void main(String[] args) {
        L_48_RotateImage img=new L_48_RotateImage();
        int[][]matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        img.rotate1(matrix);
        for(int[]arr:matrix) System.out.println(Arrays.toString(arr));
    }
}
