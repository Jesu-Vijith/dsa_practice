package NormalProblems;

import java.util.*;

public class ReversingArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        Deque<Integer> deque=new LinkedList<>();
        int temp=1;
        for(int i=temp;i<arr.length;i++){
            deque.add(arr[i]);
        }
        while (!deque.isEmpty()){
            arr[temp]=deque.pollLast();
            temp++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
