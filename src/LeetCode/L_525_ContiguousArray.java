package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L_525_ContiguousArray {
    public static void main(String[] args) {
        L_525_ContiguousArray ans=new L_525_ContiguousArray();
        int[]nums={1, 0, 1, 1, 0, 0, 1, 1};
//        System.out.println(ans.findMaxLength1(nums));
        System.out.println(ans.findMaxLength2(nums));
        System.out.println(ans.findMaxLength2alternate(nums));
    }

    //O(N) time complexity (with adding 0,-1 in the map at beginning)
    public int findMaxLength2(int[]nums){
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, -1);
            int maxlen = 0, count = 0;
            for (int i = 0; i < nums.length; i++) {
                count = count + (nums[i] == 1 ? 1 : -1);
                if (map.containsKey(count)) {
                    maxlen = Math.max(maxlen, i - map.get(count));
                } else {
                    map.put(count, i);
                }
            }
            return maxlen;
    }

    //O(N) time complexity (without adding 0,-1 in the map at beginning)
    public int findMaxLength2alternate(int[]nums){
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0, max=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]==1?1:-1;
            if(sum==0){
                max=i+1;
            }
            else if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
    }



    //O(N^2) - Time limit exceeded
    public int findMaxLength1(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int zeros=0;
            int ones=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    ones++;
                }
                if(nums[j]==0){
                    zeros++;
                }
                if(ones==zeros){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}
