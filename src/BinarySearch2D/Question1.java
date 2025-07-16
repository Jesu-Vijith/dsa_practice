package BinarySearch2D;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[][]arr={
                        {10,20,30,40},
                        {15,25,35,45},
                        {28,29,37,49},
                        {33,34,38,50}
                    };
        int target=5;
        System.out.println(Arrays.toString(findFromArr(arr,target)));
    }

    public static int[] findFromArr(int[][]arr,int target){
        int length= arr.length;
        int c=length-1;
        int r=0;
        while(c>=0 && r < length){
            if (arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            if(r<length && arr[r][c]>target){
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
