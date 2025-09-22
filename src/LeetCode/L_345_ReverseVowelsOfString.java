package LeetCode;

public class L_345_ReverseVowelsOfString {
    public String reverseVowels(String s) {
        String vowels="aeiouAEIOU";
        String[]arr=new String[s.length()];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx]=String.valueOf(s.charAt(idx));
        }
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(vowels.contains(arr[i]) && vowels.contains(arr[j])){
                String temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(!vowels.contains(arr[i])){
                i++;
            }
            else if(!vowels.contains(arr[j])){
                j--;
            }
        }
        return String.join("",arr);
    }
}
