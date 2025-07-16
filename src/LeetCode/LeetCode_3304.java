package LeetCode;

public class LeetCode_3304 {
    public static void main(String[] args) {
        System.out.println(generation("a",10));
    }
    static char generation(String word,int k){
        if(word.length()>=k){
            return word.charAt(k-1);
        }
        String tempWord="";
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            ch=(char)(ch+1);
            tempWord=tempWord+ch;
        }
        word=word+tempWord;
        System.out.println(word);
        return generation(word,k);
    }
}
