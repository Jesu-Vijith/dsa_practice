package LeetCode;

public class L_125_ValidPalindrome {
    public static boolean palindrome(String s){
        String word=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(word);
        int i=0;
        int j=word.length()-1;
        while(i<j){
            if(word.charAt(i)!=word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("A man, a plan, a canal: Panama"));
    }
}
