package LeetCode;

import java.util.*;

public class L_239_SlidingWindow {

//    O(N) time complexity
    public int[] maxSlidingWindow1(int[]nums,int k){
        Deque<Integer>deque=new LinkedList<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            while(!deque.isEmpty() && deque.getLast()<num){
                deque.pollLast();
            }
            deque.addLast(num);
            if(i>=k && nums[i-k]==deque.getFirst()){
                System.out.println("Hi");
                deque.pollFirst();
            }
            if(i>=k-1 ){
                list.add(deque.getFirst());
            }
            System.out.println(list);

        }
        return list.stream().mapToInt(elem->elem).toArray();
    }


    //O(N^2)- time limit exceededg
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i=0;
        int j=k-1;
        int count=0;
        List<Integer>list=new ArrayList<>();
        while(j<nums.length){
            int max=Integer.MIN_VALUE;
            for(int a=i;a<=j;a++){
                if(nums[a]>max){
                    max=nums[a];
                }
            }
            list.add(max);
            i++;
            j++;
            count++;
        }
        int []ans=new int [count];
        for(int idx=0;idx<count;idx++){
            ans[idx]=list.get(idx);
        }
        return ans;
    }

    public static void main(String[] args) {
        L_239_SlidingWindow l1=new L_239_SlidingWindow();
        int[]nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(l1.maxSlidingWindow(nums,k)));
        System.out.println(Arrays.toString(l1.maxSlidingWindow1(nums,k)));
    }
}
