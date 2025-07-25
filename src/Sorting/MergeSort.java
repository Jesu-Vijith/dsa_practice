package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr={8,3,4,12,5,6};
        System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1)));
    }

    static int[] mergeSort(int[]arr,int start,int end){
        if(arr.length==1){
            return arr;
        }
        int mid=(start+end)/2;
        int[]left=mergeSort(Arrays.copyOfRange(arr,0,mid),start,mid);
        int[]right=mergeSort(Arrays.copyOfRange(arr,mid,end),mid,end);

        return merge(left,right);
    }

    static int[] merge(int[]left,int[]right){
        int[]mix=new int[left.length+right.length];
        int j=0;
        int k=0;
        for(int i=0;i<mix.length;i++){
            if(j==left.length){
                mix[i]=right[k];
                k++;
            }
            else if (k==right.length){
                mix[i]=left[j];
                j++;
            }
            else {
                if (left[j] < right[k]) {
                    mix[i] = left[j];
                    j++;
                } else {
                    mix[i] = right[j];
                    j++;
                }
            }
        }
        return mix;
    }
}
