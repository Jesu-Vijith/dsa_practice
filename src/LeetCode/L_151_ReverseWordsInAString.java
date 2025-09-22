package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L_151_ReverseWordsInAString {

    public String reverse(String s){
        String[]arr=s.split(" ");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            if (arr[i].equals(" ")){

            }
            else{
                ans+=arr[i];
            }
            if(i!=0){
                ans+=" ";
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        L_151_ReverseWordsInAString rev=new L_151_ReverseWordsInAString();
        String s="the sky is blue";
        System.out.println(rev.reverse(s));
    }


    public String reverseWords(String s) {
        String[]arr=s.split(" ");
        System.out.println(Arrays.toString(arr));
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==":"){
                continue;
            }

            ans+=arr[i]+" ";
        }
        return ans;
    }
}
