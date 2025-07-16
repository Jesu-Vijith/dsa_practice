package LinkedList.LeetCodeProblems;

import java.util.ArrayList;
class HappyNumber {

    public static boolean isHappy(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        while(n!=1){
           n=findSquare(n);
           System.out.println(n);
           if(list.contains(n)){
               return false;
           }
           list.add(n);
       }

       return true;
    }

    private static int findSquare(int n) {
        if(n<10){
            return (int)Math.pow(n,2);      
        }
        int ans=0;
        while(n!=0){
            int digit=n%10;
            digit=digit*digit;
            ans=ans+digit;
            n=n/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(HappyNumber.isHappy(13));
    }
}