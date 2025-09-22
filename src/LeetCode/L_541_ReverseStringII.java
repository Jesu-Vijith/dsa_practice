package LeetCode;

public class L_541_ReverseStringII {
    public String reverseStr(String s, int k) {
        int i=0;
        int j=i+k-1;
        StringBuilder str=new StringBuilder(s);
        while(i<s.length()){
            rev(str,i,j);
            i=j+k+1;
            j=i+k-1;
            if(j>s.length()-1){
                j=s.length()-1;
            }
        }
        return str.toString();
    }
    public void rev(StringBuilder str,int i,int j){
        while(i<j){
            char ch=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,ch);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        L_541_ReverseStringII ans=new L_541_ReverseStringII();
        System.out.println(ans.reverseStr("abcdefg",2));
    }
}
