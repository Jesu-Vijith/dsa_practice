package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class L_347_top_k_frequent_elements {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
        }
        int count=0;
        List<Integer> ans=new ArrayList<>();
        while(!queue.isEmpty()){
            int f=queue.poll();
            int s=(!queue.isEmpty())?queue.peek():-1;
            count++;
            if(f!=s){
                if(count>=k){
                    ans.add(f);
                    count=0;
                }
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[]nums = {1,1,1,2,2,3};
        int k = 2;
        L_347_top_k_frequent_elements ans=new L_347_top_k_frequent_elements();
        System.out.println(Arrays.toString(ans.topKFrequent(nums,k)));
    }
}
