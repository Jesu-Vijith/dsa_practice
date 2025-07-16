package Arrays;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[]arr={10,20,30,50,60,70,80,90};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(start,end,arr);
            start++;
            end--;
        }
    }
    public static void swap(int index1,int index2,int[] arr){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
