package LeetCode;

public class L_633_SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        long left=0;
        long right=(long)Math.sqrt(c);
        while(left<=right){
            long total=(left*left)+(right*right);
            if(total>c){
                right--;
            }
            else if(total<c){
                left++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
