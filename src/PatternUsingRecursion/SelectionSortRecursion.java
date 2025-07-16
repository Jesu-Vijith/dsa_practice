package PatternUsingRecursion;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[]arr={1,4,3,5};
        selectionSort(arr,0,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[]arr,int maxIndex,int currentIndex,int end) {
        if(end==0){
            return;
        }
        if(currentIndex<=end && arr[currentIndex]>arr[maxIndex]){
            maxIndex=currentIndex;
            selectionSort(arr,maxIndex,currentIndex+1,end);
        }
        if(currentIndex>end){
            int temp=arr[end];
            arr[end]=arr[maxIndex];
            arr[maxIndex]=temp;
            selectionSort(arr,0,0,end-1);
        }
        else{
            selectionSort(arr,maxIndex,currentIndex+1,end);
        }
    }
}
