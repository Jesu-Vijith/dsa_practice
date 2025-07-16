package LeetCode;

import java.util.Stack;

public class  LeetCode_84 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int count=0;
        if(heights.length==1){
            return heights[0];
        }
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights.length;j++){
                if(i==0 && heights[i]>heights[i+1]){
                    count++;
                    break;
                }
                if(i==heights.length-1 && heights[i]>heights[i-1]){
                    count++;
                    break;
                }
                if((i!=heights.length-1 && i!=0)&&
                        (heights[i+1]<heights[i] && heights[i-1]<heights[i])){
                    count++;
                    break;
                }

                if(heights[i]<=heights[j]){
                    count++;
                }
            }
            stack.push(count*heights[i]);
            count=0;
        }
        int ans=0;
        while(!stack.isEmpty()){
            int temp=stack.pop();
            System.out.println("TEMP: "+temp);
            if(ans<temp){
                ans=temp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]heights={2,1,5,6,2,3};
        LeetCode_84 leet=new LeetCode_84();
        leet.largestRectangleArea(heights);
    }
}

