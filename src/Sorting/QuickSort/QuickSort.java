package Sorting.QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
//        int[]arr= {42, 7, 19, 3, 25, 12, 8, 55,2,0};
        int[]arr={34, 7, 23, 32, 5, 62, 32, 12, 8, 45, 19, 27,1};
        quickSort(arr,0,arr.length-1,0,arr.length-1,arr[(0+(arr.length-1))/2]);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[]arr,int start,int end,int low,int high,int pivot){
        if(low==end || high==start){
            return;
        }

        while(start<end){
            if(arr[start]>=pivot && arr[end]<=pivot){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }

            if(arr[start]<pivot){
                start++;
            }

            if(arr[end]>pivot) {
                end--;
            }
        }
        quickSort(arr,low,end,low,end,arr[(low+end)/2]);
        quickSort(arr,start+1,high,start,high,arr[(start+high)/2]);
    }
}
