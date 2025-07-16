package RecursionString.LeetCode;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }
    static String decodeString(String ques){
        if(ques.isEmpty()){
            return "";
        }
        int count=ques.charAt(0)-'0';
        int f=ques.indexOf('[');
        int l=ques.indexOf(']');
        String ch=ques.substring(f+1,l);
        String ans="";
        for(int i=0;i<count;i++){
            ans=ans+ch;
        }
        return ans+decodeString(ques.substring(l+1));
    }
}
