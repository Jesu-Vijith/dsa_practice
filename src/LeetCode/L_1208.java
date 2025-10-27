package LeetCode;


public class L_1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int output=0;
        for(int i=0;i<s.length();i++){
            int sNum=s.charAt(i);
//            System.out.println(sNum);
            int tNum=t.charAt(i);
//            System.out.println(tNum);
            if(Math.abs(sNum-tNum)<=maxCost) {
                output += 1;
                maxCost -= Math.abs(sNum - tNum);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String s = "abcd", t = "cdef";
        int maxCost = 3;
        System.out.println(new L_1208().equalSubstring(s,t,maxCost));
    }
}