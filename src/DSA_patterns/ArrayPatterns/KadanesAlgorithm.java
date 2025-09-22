package DSA_patterns.ArrayPatterns;

public class KadanesAlgorithm {

    public static int kadane(int[]arr){
        int result=arr[0];
        int maxNum=arr[0];
        for(int i=1;i<arr.length;i++){
            maxNum=Math.max(maxNum+arr[i],arr[i]);
            result=Math.max(result,maxNum);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(kadane(arr));
    }
}
