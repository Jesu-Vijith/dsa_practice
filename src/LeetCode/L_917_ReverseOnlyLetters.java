package LeetCode;

public class L_917_ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        StringBuilder str=new StringBuilder(s);
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char ch1=str.charAt(left);
            char ch2=str.charAt(right);
            int ch1ascii = (int)ch1;
            int ch2ascii = (int)ch2;
            if( ((ch1ascii>=65 && ch1ascii<=90) || (ch1ascii>=97 && ch1ascii<=122)) &&
                    ((ch2ascii>=65 && ch2ascii<=90) || (ch2ascii>=97 && ch2ascii<=122))){
                char temp=ch1;
                str.setCharAt(left,ch2);
                str.setCharAt(right,temp);
                left++;
                right--;
            }
            else if((ch1ascii<65 || ch1ascii>90) && (ch1ascii<97 || ch1ascii>122)){
                left++;
            }
            else if((ch2ascii<65 || ch2ascii>90) && (ch2ascii<97 || ch2ascii>122)){
                right--;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        L_917_ReverseOnlyLetters l=new L_917_ReverseOnlyLetters();
        System.out.println(l.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
