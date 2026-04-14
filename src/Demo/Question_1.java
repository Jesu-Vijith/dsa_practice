package Demo;

import java.util.HashMap;

public class Question_1 {
    public static void main(String[] args) {
        String S1 = "COMERCEIQ";
        String S2 = "MOCE";
        Question_1 qn1 = new Question_1();
        qn1.isPresent(S1, S2);
    }


    public void isPresent(String s1,String s2) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s2.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer>hmap=new HashMap<>();
        int left=0;
        for(int right=0;right<s1.length();right++){
            char ch=s1.charAt(right);
            if(map.containsKey(ch)){
                hmap.put(ch,hmap.getOrDefault(ch,0)+1);
                if(hmap.equals(map)){
                    System.out.println("Yes, String 2 is found in String 1");
                    System.out.println("Min: "+left);
                    System.out.println("Max: "+right);
                    return;
                }
            } else {
                while(!hmap.isEmpty() && left<s1.length()){
                    char leftChar=s1.charAt(left);
                    if(hmap.containsKey(leftChar))hmap.put(ch,hmap.get(leftChar)-1);
                    left++;
                }
            }
        }
        System.out.println("No, String 2 is not found in String 1");
}


//    public void characterRange(String s1, String s2){
//        HashMap<Character,Integer>hmap=new HashMap<>();
//        for(int i=0;i<s2.length();i++){
//            char ch=s2.charAt(i);
//            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
//        }
//        int left=0;
//        int right=0;
//        boolean isLeftFound=false;
//        for(int j=0;j<s1.length();j++){
//            char ch=s1.charAt(j);
//            if(!isLeftFound && hmap.containsKey(ch)){
//                isLeftFound=true;
//                left=j;
//            }
//            if(hmap.containsKey(ch)){
//                hmap.put(ch, hmap.get(ch)-1);
//                right=j;
//                if(hmap.get(ch)==0){
//                    hmap.remove(ch);
//                }
//                if(hmap.isEmpty()){
//                    System.out.println("Minimum Index: "+ left);
//                    System.out.println("Maximum Index: "+right);
//                }
//            }
//        }
//
//    }
//
//    public boolean isPresent(String s1,String s2){
//        HashMap<Character,Integer>hmap=new HashMap<>();
//        for(int i=0;i<s2.length();i++){
//            char ch= s2.charAt(i);
//            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
//        }
//        for(int i=0;i<s1.length();i++){
//            char ch=s1.charAt(i);
//            if(hmap.containsKey(ch)) {
//                hmap.put(ch, hmap.get(ch) - 1);
//            }
//            if(hmap.containsKey(ch) && hmap.get(ch)==0){
//                hmap.remove(ch);
//            }
//        }
//        return hmap.isEmpty();
//    }
}
