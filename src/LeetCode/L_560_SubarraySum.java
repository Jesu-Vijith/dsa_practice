package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L_560_SubarraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> subNum = new HashMap<>();
        subNum.put(0, 1);
        int total = 0;
        int count = 0;

        for (int n:nums) {
            total+=n;
            if(subNum.containsKey(total-k)){
                count+=subNum.get(total-k);
            }
            subNum.put(total, subNum.getOrDefault(total, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        L_560_SubarraySum ans=new L_560_SubarraySum();
        int[]nums={1,2,3};
        int k=3;
        System.out.println(ans.subarraySum(nums,k));
    }
}
