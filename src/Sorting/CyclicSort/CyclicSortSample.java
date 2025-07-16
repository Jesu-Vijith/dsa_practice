package Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSortSample {
    public static void main(String[] args) {
        int[]arr={4,3,1,2,5};
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[correctIndex]!=arr[i]){
                int temp=arr[correctIndex];
                arr[correctIndex]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        //MY OWN CODE
//        int[]arr={3,5,2,1,4};
//        for(int i=0;i<arr.length;i++){
//            while(arr[i]!=(i+1)){
//                int correctIndex=arr[i]-1;
//                int temp=arr[correctIndex];
//                arr[correctIndex]=arr[i];
//                arr[i]=temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
