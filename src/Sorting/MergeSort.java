package Sorting;

import java.util.Arrays;

enum Days{
    MONDAY,TUESDAY
}


public class MergeSort {
    int a;
    public static void main(String[] args) {
        int[]arr={8,3,4,12,5,6};
        MergeSort sort=new MergeSort();
        sort.a=10;
        System.out.println(sort.a);
        int b=5;
//        do{
//            System.out.println("yes");
//            a++;
//        }
//        while(a<b);
        System.out.println(Days.MONDAY);

        System.out.println(Arrays.toString(sort.mergeSort(arr)));
    }
    public int[]mergeSort(int[]arr){
        int a=19;
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[]left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[]right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        int[]ans=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }
            else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }

        return ans;

    }
}
