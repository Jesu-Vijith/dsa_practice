package LeetCode;



public class L_1299_ReplaceElements {

//        O(N^2) time complexity
//        O(N) space complexity
    public int[] replaceElements(int[] arr) {
        int[]ans=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            ans[i]=max;
        }
        ans[arr.length-1]=-1;
        return ans;
    }
}
