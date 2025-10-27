package LeetCode;

import java.util.Arrays;

public class FindingMaxMin {
    public static void main(String[] args) {
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        FindingMaxMin ans=new FindingMaxMin();
        System.out.println(Arrays.toString(ans.findingMinMax(nums)));
    }
    public int[] findingMinMax(int[]nums){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int elem:nums){
            max=Math.max(max,elem);
            min=Math.min(min,elem   );
        }
        return new int[]{min,max};
    }
}
