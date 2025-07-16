package Sorting;

import java.util.Arrays;

public class BubbleSortCode {

    public static void bubbleSort(int[]arr){
        for(int i=0;i<arr.length;i++) {
            boolean flag = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={-1,-2,-7,100,-89};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
