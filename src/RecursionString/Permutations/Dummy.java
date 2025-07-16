package RecursionString.Permutations;

public class Dummy {
    public static void main(String[] args) {
        letterCombo("","34");
    }
    static void letterCombo(String ans,String ques){
        if(ques.isEmpty()){
            System.out.println(ans);
            return;
        }
        int digit=ques.charAt(0)-'0';
        for(int i=(digit-1)*3;i<(digit*3);i++){
            char ch=(char)('a'+i);
            letterCombo(ans+ch,ques.substring(1));
        }
    }
}
