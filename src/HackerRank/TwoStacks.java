package HackerRank;

import java.util.List;
import java.util.Stack;

public class TwoStacks {
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        int sum=0;
        int i=0;
        int j=0;
        int ansCount=0;
        Stack<Integer> stack=new Stack<>();
        while(sum<maxSum){
            int first=a.get(i);
            int second=b.get(j);
            if(first<second && sum+first<maxSum){
                sum=sum+first;
                stack.add(first);
                i++;
            }
            else if(second<first && sum+second<maxSum){
                sum=sum+second;
                stack.add(second);
                j++;
            }
            else{
                break;
            }
        }

        while(!stack.isEmpty()){
            stack.pop();
            ansCount++;
        }
        return ansCount;

    }
}

