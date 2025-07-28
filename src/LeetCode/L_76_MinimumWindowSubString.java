package LeetCode;

public class L_76_MinimumWindowSubString {
    public String minWindow(String s, String t){
        int ref=0;
        for(int i=0;i<t.length();i++){
            ref=ref+t.charAt(i);
        }
        System.out.println(ref);
        int left=0;
        int ansRef=0;
        String originalAns=s;
        String ans="";
        for(int right=left;right<s.length()-1;right++){
            String ch=String.valueOf(s.charAt(right));
            if(t.contains(ch) && ansRef<ref){
                ansRef+=s.charAt(right);
                System.out.println(ansRef);
            }
            ans+=ch;
            if(ansRef==ref){
                System.out.println(ans);
                if(ans.length()<originalAns.length()) {
                    originalAns = ans;
                    System.out.println(originalAns);
                }
                ans="";
                ansRef=0;
            }

        }
        System.out.println(originalAns);
        return "Hi";
    }

    public static void main(String[] args) {
        L_76_MinimumWindowSubString l1=new L_76_MinimumWindowSubString();
//        l1.minWindow("ADOBECODEBANC","ABC");
        l1.minWindow2("ADOBECODEBANC","ABC");
    }

    public String minWindow2(String s,String t){
        int left=0;
        int ref=0;
        String ans="";
        int ansRef=0;
        for(int i=0;i<t.length();i++){
            ref+=t.charAt(i);
        }
        System.out.println(ref);
        for(int right=0;right<s.length();right++){
            String ch=String.valueOf(s.charAt(right));
            if(t.contains(ch)){
                ansRef+=s.charAt(right);
            }
            if(ansRef==ref){
                ans=s.substring(left,right);
                System.out.println(ans);
                left=right+1;
                ansRef=0;
            }
            if(ansRef==0){
                left++;
            }

        }
        System.out.println(ans);
        return "HI";
    }
}
