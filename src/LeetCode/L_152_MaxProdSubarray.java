package LeetCode;

public class L_152_MaxProdSubarray {
    public int maxProduct(int[] nums) {
        int result=Integer.MIN_VALUE;
        int maxProd=1;
        int minProd=1;

        for(int n:nums){
            result=Math.max(result,n);
        }

        for(int n:nums){
            int temp=n*maxProd;
            maxProd=Math.max(temp,Math.max(n,minProd*n));
            minProd=Math.min(temp,Math.min(n,minProd*n));
            result=Math.max(result,maxProd);
        }
        return result;
    }
}
