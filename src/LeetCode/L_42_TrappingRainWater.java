package LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class L_42_TrappingRainWater {

    //O(N) time complexity
    //O(1) space complexity
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int water=0;
        int leftMax=height[left];
        int rightMax=height[right];
        while(left<right){
            if(height[left]<=height[right]){
                leftMax=Math.max(leftMax,height[left]);
                water+=leftMax-height[left++];
            }
            else{
                rightMax=Math.max(rightMax,height[right]);
                water+=rightMax-height[right--];
            }
        }
        return water;
    }

    //Worked well finding the trapped water, till the tallest height
    //Failed to capture the trapped water which is found after the tallest height
    public int trapOwnTry(int[] height) {
        Deque<Integer> deque=new LinkedList<>();
        int ansHeight=0;
        for (int h : height) {
            if (!deque.isEmpty() && h >= deque.getFirst()) {
                int temp = deque.pollFirst();
                while (!deque.isEmpty()) {
                    ansHeight += Math.abs(temp - deque.pollFirst());
                }
            }
            deque.add(h);
        }
        return ansHeight;
    }

    public static void main(String[] args) {
        int [] height={1,2,1,2,3};
        L_42_TrappingRainWater water=new L_42_TrappingRainWater();
        System.out.println(water.trapOwnTry(height));
        System.out.println(water.trap(height));
    }

}
