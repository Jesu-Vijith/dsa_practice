package LinearSearch;

import java.util.ArrayList;

public class WealthCalculation {
    static int solution(int[][]arr){
        int maxnum=0;
        for(int[]row:arr){
            int total=0;
            for(int num:row){
                total=total+num;
            }
            if(total>maxnum){
                maxnum=total;
            }
        }
        return maxnum;
    }

    public static void main(String[] args) {
        int[][]arr={{1,2,3},{3,2,1},{3,7,5}};
        System.out.println(WealthCalculation.solution(arr));
    }
}
