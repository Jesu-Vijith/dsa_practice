package NormalProblems;

public class Parenthesis {
    public static boolean isValid(String s) {
        int start=0;
        int end=s.length()-1;
        boolean flag=true;
        while(start<end){
            if(s.charAt(start)==s.charAt(start+1)){
                start=start+2;
            }
            else if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                flag=false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
}