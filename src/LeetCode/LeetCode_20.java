package LeetCode;

import java.util.Stack;

public class LeetCode_20 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty() || ch==')' && stack.pop()!='(' || ch=='}' && stack.pop()!='{' ||ch==']' && stack.pop()!='[' ){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode_20 ans=new LeetCode_20();
        System.out.println(ans.isValid("()"));
    }
}
