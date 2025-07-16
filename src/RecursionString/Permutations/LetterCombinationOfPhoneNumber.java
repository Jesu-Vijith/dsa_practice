package RecursionString.Permutations;

import java.util.ArrayList;

//Own Try
public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        String[]arr={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String digits="182";
        int[]digitList=new int[digits.length()];
        for(int i=0;i<digits.length();i++){
            String digit= String.valueOf(digits.charAt(i));
            int num=Integer.parseInt(digit);
            digitList[i]=num;
        }
        System.out.println(letterCombo(arr[digitList[0]],arr[digitList[1]]));
    }
    static ArrayList<String> letterCombo(String first, String second){
        ArrayList<String>list=new ArrayList<>();
        if(first.isEmpty()){
            return list;
        }

        char ch=first.charAt(0);
        for(int i=0;i<second.length();i++){
            list.add(ch+""+second.charAt(i));
        }
        list.addAll(letterCombo(first.substring(1),second));
        return list;
    }
}
