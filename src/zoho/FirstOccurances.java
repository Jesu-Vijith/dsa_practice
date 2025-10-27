package zoho;

//Given two strings, find the first occurrence of all characters of second string in the first string and
//print the characters between the least and the highest index
//I/P: ZOHOCORPORATION PORT
//O/P: OHOCORPORAT
//Explanation: The index of P in first string is 7, O is 1, R is 6 and T is 11. The largest range is 1 – 11.
//So print the characters of the first string in this inex range i.e. OHOCORPORAT

import java.util.Map;
import java.util.TreeMap;

public class FirstOccurances {
    public static void main(String[] args) {
        String qn="ZOHOCORPORATION";
        String s="PORT";
        TreeMap<Integer,Character> map=new TreeMap<>();
        for(int i=0;i<qn.length();i++){
            char ch=qn.charAt(i);
            if(s.contains(String.valueOf(ch)) && !map.containsValue(ch)) {
                map.put(i, ch);
            }
        }
        int first=map.firstKey();
        int last=map.lastKey();
        System.out.println(qn.substring(first,last+1));
    }
}
