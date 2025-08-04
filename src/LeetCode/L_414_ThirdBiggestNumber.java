package LeetCode;

import java.util.Collections;
import java.util.PriorityQueue;

public class L_414_ThirdBiggestNumber {

//    Time complexity - O(N)
//    Space Complexity - O(1)
    public int thirdMax1(int[] nums) {
        long first=Long.MIN_VALUE;
        long second=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            long n=nums[i];
            if(n==first || n==second || n==third){
                continue;
            }
            if(n>first){
                third=second;
                second=first;
                first=n;
            }
            else if(n>second){
                third=second;
                second=n;
            }
            else if(n>third){
                third=n;
            }
        }
        return third==Long.MIN_VALUE?(int)first:(int)third;
    }

//    Time Complexity- O(N logN) (for adding and removing elements from a heap)
//    Space Complexity- O(N)
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            maxHeap.add(nums[i]);
        }
        int firstBig=maxHeap.poll();
        int secondBig=Integer.MIN_VALUE;
        while(!maxHeap.isEmpty()){
            secondBig=maxHeap.poll();
            if(secondBig!=firstBig){
                break;
            }
        }

        while(!maxHeap.isEmpty()){
            int thirdBig=maxHeap.poll();
            if(thirdBig!=secondBig){
                return thirdBig;
            }
        }
        return firstBig;
    }

}
