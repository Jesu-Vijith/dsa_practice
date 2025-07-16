package RecursionString.LeetCode;

public class LetterCombinationLeetcode {
    public static void main(String[] args) {
        letterCombo("","21");
    }
    static void letterCombo(String ans,String ques){
        if(ques.isEmpty()){
            System.out.println(ans);
            return;
        }
        int digit=ques.charAt(0)-'0';
        if(digit==1){
            letterCombo(ans,ques.substring(1));
            return;
        }
        int start=digit>=8?(digit-2)*3+1:(digit-2)*3;
        int end=digit<7?(digit*3)-3:(digit*3)-2;
        if(digit==9){
            end=(digit*3)-1;
        }
        for(int i=start;i<end;i++){
            char ch=(char)('a'+i);
            letterCombo(ans+ch,ques.substring(1));
        }
    }
}
