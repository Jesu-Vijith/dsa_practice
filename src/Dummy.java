import java.util.*;

public class Dummy{
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            while(!deque.isEmpty() && deque.peekLast()<nums[i]){
                deque.pollLast();
            }
            deque.addLast(nums[i]);
            if(i+1>=k){
                list.add(deque.peekFirst());
            }
            if(!deque.isEmpty() && i>k && deque.peekFirst()==nums[i-k]){
                deque.pollFirst();
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Dummy d1=new Dummy();
        int[]nums={1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(d1.maxSlidingWindow(nums, k)));
    }
}
