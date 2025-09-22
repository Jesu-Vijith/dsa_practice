package LeetCode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class L_2149_RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        Deque<Integer> deque=new LinkedList<>();
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>=0){
                deque.addFirst(nums[i]);
            }
            else{
                deque.addLast(nums[i]);
            }
        }
        int[]ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=deque.pollFirst();
            }
            else{
                ans[i]=deque.pollLast();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        L_2149_RearrangeArrayElementsBySign ans=new L_2149_RearrangeArrayElementsBySign();
        int[]arr={-3,2,-4,1};
        System.out.println(Arrays.toString(ans.rearrangeArray(arr)));
    }
}
