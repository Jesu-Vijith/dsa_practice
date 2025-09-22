package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_77_Combinations {

    public static List<List<Integer>>combine(int n,int k) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>comb=new ArrayList<>();
        backtrack(1,result,comb,n,k);
        return result;
    }

    public static void backtrack(int start,List<List<Integer>>result,List<Integer>comb,int n,int k){
        if(comb.size()==k){
            System.out.println(comb);
            result.add(comb);
            System.out.println(result);
            return;
        }
        for(int num=start;num<=n;num++){
            comb.add(num);
            backtrack(num+1,result,comb,n,k);
            comb.removeLast();
        }
    }
    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println(combine(n,k));
    }
}
