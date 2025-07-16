package Sorting;

//Non-comparison sorting algorithm, good for smaller numbers


import java.util.Arrays;

public class CountSort {

    public static int[] countSort (int[]arr){
        if(arr==null || arr.length<=1){
            return arr;
        }
        int max=0;
        for(int elem:arr){
            if(elem>max){
                max=elem;
            }
        }
        int [] newArr=new int[max+1];
        for(int elem:arr){
            newArr[elem]++;
        }
//        for(int i=0;i<max;i++){
//            if(i>arr.length-1){
//                newArr[i]=0;
//                continue;
//            }
//            if(arr[i]==i) {
//                newArr[i] =newArr[i]+1;
//            }
//        }
        int[]ansArr=new int[arr.length];
        int j=0;
        for(int i=0;i<=max;i++) {
            int count = newArr[i];
            while (count > 0) {
                ansArr[j] = i;
                j++;
                count--;
            }
        }
        return ansArr;
    }

    public static void main(String[] args) {
        int[]arr={1,2,4,8,1};
        int[]ans=countSort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
