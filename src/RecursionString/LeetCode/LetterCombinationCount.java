package RecursionString.LeetCode;

public class LetterCombinationCount {
    public static void main(String[] args) {
        System.out.println("LetterCombo Count: "+letterCombo("","24"));
    }
    static int letterCombo(String ans,String ques){
        if(ques.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=ques.charAt(0)-'0';
        if(digit==1){
             count=count+letterCombo(ans,ques.substring(1));
        }
        int start=digit>=8?(digit-2)*3+1:(digit-2)*3;
        int end=digit<7?(digit*3)-3:(digit*3)-2;
        if(digit==9){
            end=(digit*3)-1;
        }
        for(int i=start;i<end;i++){
            char ch=(char)('a'+i);
            count=count+letterCombo(ans+ch,ques.substring(1));
        }
        return count;
    }
}
