package DSA_patterns.ArrayPatterns;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
//        System.out.println(prefixAns(arr,1,4));
        System.out.println(Arrays.toString(returnPrefixArray(arr)));
        System.out.println(Arrays.toString(returnPrefixArrayWithExtraIndex(arr)));

    }
    public static int prefixAns(int[]arr,int start,int end){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp+=arr[i];
            arr[i]=temp;
        }
        return arr[end]-arr[start-1];
    }

    public static int[] returnPrefixArray(int[]arr){
        int[]prefixArr=new int[arr.length];
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp+=arr[i];
            prefixArr[i]=temp;
        }
        return prefixArr;
    }

    public static int[] returnPrefixArrayWithExtraIndex(int[]arr){
        int[]prefixArr=new int[arr.length+1];
        for(int i=1;i<prefixArr.length;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i-1];
        }
        return prefixArr;
    }

}
