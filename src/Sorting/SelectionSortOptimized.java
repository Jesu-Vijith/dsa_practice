package Sorting;

import java.util.Arrays;

public class SelectionSortOptimized {
    public static void main(String[] args) {
        int[]arr={-1,-2,-7,100,-89 };
        for(int i=0;i<arr.length;i++){
            int start=0;
            int end=arr.length-1-i;
            int maxIndex=maximum(arr,start,end);
            swap(arr,maxIndex,end);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[]arr,int maxIndex,int end){
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[end];
        arr[end]=temp;
    }

    public static int maximum(int[]arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
