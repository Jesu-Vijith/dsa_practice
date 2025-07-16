package LeetCode;

import java.util.Stack;

public class LeetCode_1541 {
    public int approach1(String s) {
        int ansCount=0;
        int bracketCount=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.add(s.charAt(i));
            }
            else{
                bracketCount++;
                if(bracketCount==2 && !stack.isEmpty()){
                    stack.pop();
                    bracketCount=0;
                }
                else if(bracketCount==2 && stack.isEmpty()){
                    ansCount++;
                    bracketCount=0;
                }
            }
        }
        while(!stack.isEmpty()){
            if(bracketCount==0){
                stack.pop();
                ansCount+=2;
            }
            else{
                stack.pop();
                ansCount++;
            }
        }
        return ansCount;
    }

    public int minInsertions(String s) {
        int count=0;
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else{
                if(i<s.length()-1  && s.charAt(i+1)==')'){
                    if(stack.isEmpty()){
                        count++;
                        i++;
                    }
                    else {
                        stack.pop();
                        i++;
                    }
                }
                else{

                }
//                else if(!stack.isEmpty()){
//                    stack.pop();
//                    count++;
//                }
//                else{
//                    count++;
//                }
            }
        }

        return count+stack.size()*2;
    }

    public static void main(String[] args) {
        LeetCode_1541 ans=new LeetCode_1541();
        System.out.println(ans.minInsertions(")))))))"));
    }
}
