package Sorting.CyclicSort;

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[]arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i];
            if(correctIndex<arr.length && arr[correctIndex]!=arr[i]){
                int temp=arr[correctIndex];
                arr[correctIndex]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr={3,0,1};
        System.out.println(missingNumber(arr));
    }
}
