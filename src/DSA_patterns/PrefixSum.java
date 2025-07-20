package DSA_patterns;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        System.out.println(prefixAns(arr,1,4));

    }
    public static int prefixAns(int[]arr,int start,int end){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp+=arr[i];
            arr[i]=temp;
        }
        return arr[end]-arr[start-1];
    }

}
