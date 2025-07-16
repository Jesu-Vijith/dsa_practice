package RecursionString.BasicQuestions;

public class SkipACharacter {
    public static void main(String[] args) {
//        System.out.println(skipACharacter2("baccadh",""));
        System.out.println(skipKunal("baccadh"));
    }

    static String skipKunal(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skipKunal(up.substring(1));
        }
        else{
            System.out.println(ch);
            return ch+skipKunal(up.substring(1));
        }
    }

    static String skipACharacter2(String ques,String ans){
        if(ques.isEmpty()){
            return ans;
        }
        char ch=ques.charAt(0);
        if(ch=='a'){
            return skipACharacter2(ques.substring(1),ans);
        }
        else{
            return skipACharacter2(ques.substring(1),ans+ch);
        }
    }

    static String skipACharacter(String ans,String ques,int i){
        if(i==ques.length()){
            return ans;
        }
        if(ques.charAt(i)!='a'){
            ans=ans+ques.charAt(i);
        }
        return skipACharacter(ans,ques,i+1);
    }
}
